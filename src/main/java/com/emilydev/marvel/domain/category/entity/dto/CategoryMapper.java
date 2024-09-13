package com.emilydev.marvel.domain.category.entity.dto;


import com.emilydev.marvel.domain.category.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category toEntity(CategoryRequestDto requestDto);

    CategoryResponseDto toResponseDto(Category category);
}
