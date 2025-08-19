package com.mentormentee.eAuctionHouse_be.service;

import com.mentormentee.eAuctionHouse_be.domain.Product;
import com.mentormentee.eAuctionHouse_be.dto.ProductDTO;

public interface ProductService {
    ProductDTO addProduct(ProductDTO product);
    ProductDTO getProductById(String id);
}
