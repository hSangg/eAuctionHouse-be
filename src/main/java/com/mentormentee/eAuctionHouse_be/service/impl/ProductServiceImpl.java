package com.mentormentee.eAuctionHouse_be.service.impl;

import com.mentormentee.eAuctionHouse_be.domain.Product;
import com.mentormentee.eAuctionHouse_be.dto.ProductDTO;
import com.mentormentee.eAuctionHouse_be.exception.AppBadRequestException;
import com.mentormentee.eAuctionHouse_be.repository.ProductRepository;
import com.mentormentee.eAuctionHouse_be.service.ProductService;
import com.mentormentee.eAuctionHouse_be.service.mapper.ProductMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.mentormentee.eAuctionHouse_be.exception.ErrorCode.PRODUCT_NOT_FOUND;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public ProductDTO addProduct(ProductDTO dto) {
        var entity = productMapper.toEntity(dto);
        var result = productRepository.save(entity);

        return productMapper.toDto(result);
    }

    @Override
    public ProductDTO getProductById(String id) {
        var product = productRepository.findById(id)
            .orElseThrow(() -> new AppBadRequestException(PRODUCT_NOT_FOUND));
        return productMapper.toDto(product);
    }
}
