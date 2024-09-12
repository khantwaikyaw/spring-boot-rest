package com.emilydev.marvel.domain.category.entity.dto;

import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Data
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class CategoryResponseDto {
    UUID id;
    String name;
    String description;
}
