package com.mentormentee.eAuctionHouse_be.controller;

import com.mentormentee.eAuctionHouse_be.domain.Product;
import com.mentormentee.eAuctionHouse_be.dto.ProductDTO;
import com.mentormentee.eAuctionHouse_be.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO product) {
        var result = productService.addProduct(product);
        return ResponseEntity.ok().body(result);
    }
}
