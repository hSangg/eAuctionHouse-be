package com.mentormentee.eAuctionHouse_be.config;

import com.mentormentee.eAuctionHouse_be.repository.CategoryRepository;
import com.mentormentee.eAuctionHouse_be.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

    private final UserRepository userRepository;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) {
        OAuth2User oAuth2User = super.loadUser(userRequest);

        String email = oAuth2User.getAttribute("email");
        String name = oAuth2User.getAttribute("name");

        userRepository.findByEmail(email).orElseGet(() -> {
            var user = new com.mentormentee.eAuctionHouse_be.domain.User();
            user.setEmail(email);
            user.setUsername(name);
            return userRepository.save(user);
        });

        return oAuth2User;
    }
}
