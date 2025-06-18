package com.example.test_Aigis.Service;

import com.example.test_Aigis.Dto.Category;
import com.example.test_Aigis.Dto.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.xml.catalog.Catalog;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    public List<Category>categories(Integer id){

        List<Category>data = new ArrayList<>();

        int count = 0 ;
        for (int i = 1 ; i <= 4 ; i++){

            List<Item>items = new ArrayList<>();
            for (int j = 0 ; j < 6 ; j++){
                items.add(Item.builder()
                                .id(count++)
                                .tittle("Tittle")
                                .dateTime("Date/Time")
                                .description("Description")
                        .build());
            }

            data.add(Category.builder()
                            .category(  "Category " + i)
                            .item(items)
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
