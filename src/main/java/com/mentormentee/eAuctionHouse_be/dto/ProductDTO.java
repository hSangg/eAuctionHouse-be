package com.mentormentee.eAuctionHouse_be.dto;

import com.mentormentee.eAuctionHouse_be.domain.enumerate.ProductCondition;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {

    private String id;

    private String title;

    private String description;

    private ProductCondition condition;

    private boolean isActive;

    private UUID sellerId;
}
