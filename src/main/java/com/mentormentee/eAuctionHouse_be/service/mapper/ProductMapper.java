package com.mentormentee.eAuctionHouse_be.service.mapper;

import com.mentormentee.eAuctionHouse_be.domain.Product;
import com.mentormentee.eAuctionHouse_be.dto.ProductDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends EntityMapper<ProductDTO, Product> {

}
