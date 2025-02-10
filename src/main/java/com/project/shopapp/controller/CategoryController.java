package com.project.shopapp.controller;

import com.project.shopapp.dtos.CategoryDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;


@RestController
@RequestMapping("api/v1/categories")
//@Validated
public class CategoryController {
    @GetMapping("")
    public ResponseEntity<String> getAllCategories(
            @RequestParam("page") int page,
            @RequestParam("limit") int limit
    ) {
        return ResponseEntity.ok(String.format("All categories, page: %d, limit: %d", page, limit));
    }

    @PostMapping("")
    public ResponseEntity<?> insertCategories(
            @RequestBody @Valid CategoryDTO categoryDTO,
            BindingResult result) {
        if (result.hasErrors()) {
            List<String> errorMessage = result.getFieldErrors()
                    .stream()
                    .map(FieldError::getDefaultMessage)
                    .toList();
            return ResponseEntity.badRequest().body(errorMessage);
        }
        return ResponseEntity.ok("Insert categories" + categoryDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCategories(@PathVariable Long id) {
        return ResponseEntity.ok("Update categories id=" + id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategories(@PathVariable Long id) {
        return ResponseEntity.ok("Delete categories id = " + id);
    }
}
