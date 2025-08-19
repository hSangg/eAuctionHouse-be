package com.mentormentee.eAuctionHouse_be.service.mapper;

import com.mentormentee.eAuctionHouse_be.domain.Category;
import com.mentormentee.eAuctionHouse_be.domain.Product;
import com.mentormentee.eAuctionHouse_be.dto.CategoryDTO;
import com.mentormentee.eAuctionHouse_be.dto.ProductDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends EntityMapper<CategoryDTO, Category> {

}
