package com.mentormentee.eAuctionHouse_be.domain;


import com.mentormentee.eAuctionHouse_be.domain.enumerate.ProductCondition;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "products")
public class Product {

    @Id
    private String id;

    private UUID sellerId;

    @DBRef(lazy = true)
    private Category category;

    private String title;

    private String description;

    private ProductCondition condition;

    @Builder.Default
    private boolean isActive = true;
}
