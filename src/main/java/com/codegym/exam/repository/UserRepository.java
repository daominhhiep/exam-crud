package com.codegym.exam.repository;

import com.codegym.exam.model.Category;
import com.codegym.exam.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    Iterable<User> findAllByCategory(Category category);

    Page<Category> findAllByUsernameContaining(String username, Pageable pageable);
}
