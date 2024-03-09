package dev.ruthwik.productservice.controllers;

import dev.ruthwik.productservice.models.Category;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return null;
    }

    @GetMapping("/categories/{id}")
    public Category getCategory(@PathVariable("id") Long id) {
        return null;
    }
}