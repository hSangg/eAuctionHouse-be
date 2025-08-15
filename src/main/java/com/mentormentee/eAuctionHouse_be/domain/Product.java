package com.mentormentee.eAuctionHouse_be.domain;


import com.mentormentee.eAuctionHouse_be.domain.enumerate.ProductCondition;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "products")
public class Product {

    @Id
    private UUID id;

    private UUID sellerId;

    private UUID categoryId;

    private String title;

    private String description;

    private ProductCondition condition;

    @Builder.Default
    private boolean isActive = true;
}
