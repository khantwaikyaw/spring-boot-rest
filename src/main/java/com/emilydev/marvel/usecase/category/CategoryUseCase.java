package com.emilydev.marvel.usecase.category;

import com.emilydev.marvel.core.exception.BadRequestException;
import com.emilydev.marvel.domain.category.entity.Category;
import com.emilydev.marvel.domain.category.entity.dto.CategoryRequestDto;
import com.emilydev.marvel.domain.category.entity.dto.CategoryResponseDto;
import com.emilydev.marvel.usecase.category.mapper.CategoryMapper;
import com.emilydev.marvel.usecase.category.service.CategoryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Component
public class CategoryUseCase {

    private final CategoryServiceImpl serviceImpl;

    public CategoryResponseDto create(CategoryRequestDto requestDto) throws BadRequestException {
        Category category = CategoryMapper.toEntity(requestDto);
        return CategoryMapper.toResponseDto(serviceImpl.create(category));
    }

    public Collection<CategoryResponseDto> findAll() {
        Collection<Category> categories = serviceImpl.findAll();
        return categories.stream().map(CategoryMapper::toResponseDto).toList();
    }

    public Optional<CategoryResponseDto> findOne(UUID id) {
        Optional<Category> category = serviceImpl.findOne(id);
        return category.map(CategoryMapper::toResponseDto);
    }
}
