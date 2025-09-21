package com.mentormentee.eAuctionHouse_be.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.io.IOException;

@Controller
public class AuthController {

    @GetMapping("/")
    public String home() {
        return "redirect:/login";
    }

    @GetMapping(value = "/login", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String login() throws IOException {
        ClassPathResource resource = new ClassPathResource("templates/login.html");
        String content = StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);

        // Replace Thymeleaf expressions with actual values
        content = content.replace("th:action=\"@{/oauth2/authorization/google}\"", "action=\"/eAuction-house-api/oauth2/authorization/google\"");
        content = content.replace("th:if=\"${param.error}\"", "style=\"display:none\"");
        content = content.replace("th:if=\"${param.logout}\"", "style=\"display:none\"");

        return content;
    }

    @GetMapping("/user")
    @ResponseBody
    public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
        return principal.getAttributes();
    }
}
