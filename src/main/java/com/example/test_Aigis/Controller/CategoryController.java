package com.example.test_Aigis.Controller;

import com.example.test_Aigis.Service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CategoryController {
    //dd
    private final CategoryService categoryService;

    @GetMapping("/tes2")
    public String data(){
        return "Cek";
    }

    @GetMapping("/testing2")
    public String cek(){
        return "tess";
    }
    @GetMapping("/search")
    public ResponseEntity<?>searchByTitle(@RequestParam(defaultValue = "", name = "title")String title){
        var res = categoryService.searchByTitle(title);

        return ResponseEntity.ok(res);
    }

    @GetMapping("/category")
    public ResponseEntity<?>categoryController(@RequestParam(defaultValue = "" ,name = "cat")String cat){
        //dwdwdw
        var res = categoryService.categories(cat);

        return ResponseEntity.ok(res);
    }

    @GetMapping("/listCategory")
    public ResponseEntity<?>testing(){

        var res = categoryService.listCategory();
        return ResponseEntity.ok(res);
    }

    @GetMapping("/testData")
    public void date(@RequestParam(value = "date" , required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date){
        log.info("date : {} " , date);

    }



}
