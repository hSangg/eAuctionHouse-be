package com.mentormentee.eAuctionHouse_be.service.impl;

import com.mentormentee.eAuctionHouse_be.dto.CategoryDTO;
import com.mentormentee.eAuctionHouse_be.exception.AppBadRequestException;
import com.mentormentee.eAuctionHouse_be.exception.ErrorCode;
import com.mentormentee.eAuctionHouse_be.repository.CategoryRepository;
import com.mentormentee.eAuctionHouse_be.service.CategoryService;
import com.mentormentee.eAuctionHouse_be.service.mapper.CategoryMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {


    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public CategoryDTO addCategory(CategoryDTO dto) {
        var entity = categoryMapper.toEntity(dto);

        if (Objects.nonNull(dto.getParentId())) {
            var parentCategory = categoryRepository.findById(dto.getParentId())
                .orElseThrow(() -> new AppBadRequestException(ErrorCode.PARENT_CATEGORY_NOT_FOUND));
            entity.setParent(parentCategory);
        }

        var result = categoryRepository.save(entity);
        return categoryMapper.toDto(result);
    }

    @Override
    public CategoryDTO getCategoryById(String id) {
        var category = categoryRepository.findById(id)
            .orElseThrow(() -> new AppBadRequestException(ErrorCode.PARENT_CATEGORY_NOT_FOUND));
        return categoryMapper.toDto(category);
    }
}
