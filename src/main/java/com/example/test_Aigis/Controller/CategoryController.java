package com.example.test_Aigis.Controller;

import com.example.test_Aigis.Service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CategoryController {
    //dd
    private final CategoryService categoryService;

    @GetMapping("/category")
    public ResponseEntity<?>categoryService(@RequestParam(defaultValue = "0" ,name = "id")Integer id){

        var res = categoryService.categories(id);

        return ResponseEntity.ok(res);
    }

    @GetMapping("/listCategory")
    public ResponseEntity<?>testing(){

        var res = categoryService.listCategory();
        return ResponseEntity.ok(res);
    }


}
