package com.mentormentee.eAuctionHouse_be.service;

import com.mentormentee.eAuctionHouse_be.dto.CategoryDTO;
import com.mentormentee.eAuctionHouse_be.dto.ProductDTO;

public interface CategoryService {
    CategoryDTO addCategory(CategoryDTO dto);
    CategoryDTO getCategoryById(String id);
}
