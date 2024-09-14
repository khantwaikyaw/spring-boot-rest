package com.emilydev.marvel.domain.category.service;

import com.emilydev.marvel.core.service.ServiceInterface;
import com.emilydev.marvel.domain.category.entity.Category;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface CategoryService extends ServiceInterface<Category> {
    Category create(Category category);

    Collection<Category> findAll();

    Optional<Category> findOne(UUID id);

    Category update(Category category);

    void delete(UUID id);

    Boolean isExist(UUID id);
}
