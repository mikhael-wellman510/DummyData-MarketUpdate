package com.example.test_Aigis.Service;

import com.example.test_Aigis.Dto.Category;
import com.example.test_Aigis.Dto.CategoryName;
import com.example.test_Aigis.Dto.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.xml.catalog.Catalog;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    public List<CategoryName>listCategory(){
            List<CategoryName> res = new ArrayList<>();
            int id = 1;
            for (int i = 1 ; i < 5 ; i++){
                res.add(CategoryName.builder()
                                .id("c"+id++)
                                .category("Category " + i)
                        .build());
            }


        return res;
    }

    public List<Category>categories(Integer id){

        List<Category>data = new ArrayList<>();

        int count = 0 ;
        for (int i = 1 ; i <= 6 ; i++){

                data.add(Category.builder()
                                .id(count++)
                                .tittle("Tittle")
                                .dateTime("Date/Time")
                                .description("Description")
                                .category("Category " + i)
                                .url("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhFrvr6wHUjK4lsHgShVe5ToYSv-rz7NF_ohUIhMK28H_mo0Dy8pSQ29RTimoozvUBT_VdNoMlprR31xdgI11x5LBCERcXUwlzMbG57NvVXqHc8dsfw63FTYb-dzqOO8wFoZRIZv9LQieBSIKnPRLUqAhQPppfv2INeZK1AVbUiijb7bJhAXvwPcfIYQAQ/s640/DEMOCRAZY.ID%20(6)%20(Custom).jpg")
                        .build());
        }


        if (id == 0){

            return data;
        }else if (id > 0 && id <= data.size()){
            return List.of(data.get(id-1));
        }else {
            return List.of();
        }

    }
}
