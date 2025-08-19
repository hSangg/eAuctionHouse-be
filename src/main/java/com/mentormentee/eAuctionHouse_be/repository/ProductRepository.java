package com.mentormentee.eAuctionHouse_be.repository;

import com.mentormentee.eAuctionHouse_be.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ProductRepository extends MongoRepository<Product, String> {

}
