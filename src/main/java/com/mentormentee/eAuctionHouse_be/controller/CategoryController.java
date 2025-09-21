package com.mentormentee.eAuctionHouse_be.controller;

import com.mentormentee.eAuctionHouse_be.dto.CategoryDTO;
import com.mentormentee.eAuctionHouse_be.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping
    public ResponseEntity<CategoryDTO> addCategory(@RequestBody CategoryDTO dto) {
        return ResponseEntity
                .ok()
                .body(categoryService.addCategory(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDTO> getCategoryById(@PathVariable String id) {
        return ResponseEntity
                .ok()
                .body(categoryService.getCategoryById(id));
    }
}
