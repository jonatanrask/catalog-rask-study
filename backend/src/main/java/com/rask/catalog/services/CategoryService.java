package com.rask.catalog.services;

import com.rask.catalog.dto.CategoryDTO;
import com.rask.catalog.entities.Category;
import com.rask.catalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<CategoryDTO> findAll(){
        List<Category> list = repository.findAll();

        return list.stream().map(CategoryDTO::new).collect(Collectors.toList());


    }

}
