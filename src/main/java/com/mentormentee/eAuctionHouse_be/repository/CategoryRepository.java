package com.mentormentee.eAuctionHouse_be.repository;

import com.mentormentee.eAuctionHouse_be.domain.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {

}
