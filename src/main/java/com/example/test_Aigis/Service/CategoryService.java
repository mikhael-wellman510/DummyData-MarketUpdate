package com.example.test_Aigis.Service;

import com.example.test_Aigis.Dto.Category;
import com.example.test_Aigis.Dto.CategoryName;
import com.example.test_Aigis.Dto.Item;
import com.example.test_Aigis.Dto.ListCategory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.xml.catalog.Catalog;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CategoryService {

    public List<CategoryName>listCategory(){
            List<CategoryName> res = new ArrayList<>();
            int id = 1;
            for (int i = 1 ; i < 5 ; i++){
                res.add(CategoryName.builder()
                                .id(id)
                                .category("Category " + i)
                        .build());
            }


        return res;
    }

    public List<ListCategory>categories(Integer id){

        List<ListCategory>data = new ArrayList<>();

        int idCat = 1;
        int count = 1 ;
        for (int i = 1 ; i <= 6 ; i++){

            List<Category>cat =new ArrayList<>();

            for (int j = 0 ; j < 6 ; j++){
                cat.add(Category.builder()
                        .id(count++)
                        .tittle("Tittle")
                        .dateTime("Date/Time")
                        .description("Description")
                        .category("Category " + id)
                        .url("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhFrvr6wHUjK4lsHgShVe5ToYSv-rz7NF_ohUIhMK28H_mo0Dy8pSQ29RTimoozvUBT_VdNoMlprR31xdgI11x5LBCERcXUwlzMbG57NvVXqHc8dsfw63FTYb-dzqOO8wFoZRIZv9LQieBSIKnPRLUqAhQPppfv2INeZK1AVbUiijb7bJhAXvwPcfIYQAQ/s640/DEMOCRAZY.ID%20(6)%20(Custom).jpg")
                        .build());
            }

            data.add(ListCategory.builder()
                            .id(idCat++)
                            .categories(cat)
                    .build());

        }

        log.info("data : {} " , data);
        if (id == 0){

            return data;
        }else if (id > 0 && id <= data.size()){
            return List.of(data.get(id-1));
        }else {
            return List.of();
        }

    }
}
