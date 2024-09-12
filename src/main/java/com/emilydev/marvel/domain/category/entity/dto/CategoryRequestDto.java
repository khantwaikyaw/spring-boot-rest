package com.emilydev.marvel.domain.category.entity.dto;

import lombok.Data;
import lombok.experimental.FieldDefaults;


@Data
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class CategoryRequestDto {
    String name;
    String description;
}
