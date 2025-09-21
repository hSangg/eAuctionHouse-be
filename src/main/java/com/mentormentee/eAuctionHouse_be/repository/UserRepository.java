package com.mentormentee.eAuctionHouse_be.repository;

import com.mentormentee.eAuctionHouse_be.domain.Product;
import com.mentormentee.eAuctionHouse_be.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
}
