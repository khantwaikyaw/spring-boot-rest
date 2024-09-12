package com.emilydev.marvel.domain.category.service;

import com.emilydev.marvel.domain.category.entity.dto.CategoryRequestDto;
import com.emilydev.marvel.domain.category.entity.dto.CategoryResponseDto;

public interface CategoryService {
    CategoryResponseDto create(CategoryRequestDto requestDto);

}
