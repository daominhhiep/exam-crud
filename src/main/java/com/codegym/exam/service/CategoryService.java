package com.codegym.exam.service;

import com.codegym.exam.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryService {
    Iterable<Category> findAll();

    Category findById(Long id);

    void save(Category category);

    void remove(Long id);
}
