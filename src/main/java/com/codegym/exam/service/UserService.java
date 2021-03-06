package com.codegym.exam.service;

import com.codegym.exam.model.Category;
import com.codegym.exam.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Page<User> findAll(Pageable pageable);

    User findById(Long id);

    void save(User user);

    void remove(Long id);
}
