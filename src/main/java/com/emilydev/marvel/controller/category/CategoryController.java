package com.emilydev.marvel.controller.category;

import com.emilydev.marvel.domain.category.entity.dto.CategoryRequestDto;
import com.emilydev.marvel.domain.category.entity.dto.CategoryResponseDto;
import com.emilydev.marvel.usecase.category.service.CategoryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryServiceImpl serviceImpl;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private ResponseEntity<CategoryResponseDto> create(@RequestBody CategoryRequestDto requestDTO) {
        CategoryResponseDto categoryDto = serviceImpl.create(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryDto);
    }

}
