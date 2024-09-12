package com.emilydev.marvel.domain.category.entity.dto;


import com.emilydev.marvel.domain.category.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryMapper {

    Category toEntity(CategoryRequestDto requestDto);

    CategoryResponseDto toResponseDto(Category category);
}
