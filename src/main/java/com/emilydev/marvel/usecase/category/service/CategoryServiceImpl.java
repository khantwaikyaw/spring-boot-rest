package com.emilydev.marvel.usecase.category.service;

import com.emilydev.marvel.domain.category.entity.Category;
import com.emilydev.marvel.domain.category.entity.dto.CategoryRequestDto;
import com.emilydev.marvel.domain.category.entity.dto.CategoryResponseDto;
import com.emilydev.marvel.domain.category.service.CategoryService;
import com.emilydev.marvel.usecase.category.mapper.CategoryMapper;
import com.emilydev.marvel.usecase.category.repository.CategoryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repo;

//    CategoryMapper mapper = new CategoryMapper();

//    @Autowired
//    private final CategoryMapper mapper;

//    private final CategoryMapper mapper;
//    private final CategoryMapper mapper = CategoryMapper.INSTANCE;

    @Override
    public CategoryResponseDto create(CategoryRequestDto requestDto) {
        Category categoryEntity = CategoryMapper.toEntity(requestDto);
        Category savedCategory = repo.save(categoryEntity);
        log.info("Created category: {}", savedCategory);

        return CategoryMapper.toResponseDto(savedCategory);
    }
}
