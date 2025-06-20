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
import java.util.Objects;

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
                                .category("c" + i)
                        .build());
            }

            log.info("List terbaru : -----");
        return res;
    }

    public List<Category>categories(String c){


        log.info("Cek {} " , c);


            List<Category>cat =new ArrayList<>();
            int curr = 1;

            for (int j = 0 ; j < 25 ; j++){
               int idCat = (j / 5) + 1;
                cat.add(Category.builder()
                        .id(curr++)
                        .tittle(title().get(j))
                        .dateTime("Date/Time")
                        .description("Description")
                        .category("c" + idCat)
                        .url("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhFrvr6wHUjK4lsHgShVe5ToYSv-rz7NF_ohUIhMK28H_mo0Dy8pSQ29RTimoozvUBT_VdNoMlprR31xdgI11x5LBCERcXUwlzMbG57NvVXqHc8dsfw63FTYb-dzqOO8wFoZRIZv9LQieBSIKnPRLUqAhQPppfv2INeZK1AVbUiijb7bJhAXvwPcfIYQAQ/s640/DEMOCRAZY.ID%20(6)%20(Custom).jpg")
                        .build());
            }


        if (Objects.equals(c, "")){

            return cat;
        }else if (c.startsWith("c")){
            int res = Integer.parseInt(c.substring(1));
            log.info("res {} " , res);
            if (res > 0 && res <= 5){
                return cat.stream()
                        .filter(val -> val.getCategory().equals(c))
                        .toList();
            }else {
                return List.of();
            }

        }else {
            return List.of();
        }

    }

    public List<String> title(){


        return  List.of(
                "Perbankan",
                "Danantara",
                "Ekonomi",
                "Politik",
                "Teknologi",
                "Pendidikan",
                "Kesehatan",
                "Transportasi",
                "Energi",
                "Pertanian",
                "Lingkungan",
                "Pariwisata",
                "Industri Kreatif",
                "Startup",
                "Keuangan Digital",
                "Cybersecurity",
                "Infrastruktur",
                "E-Commerce",
                "Media Sosial",
                "AI dan Data",
                "Investasi",
                "Blockchain",
                "Pemerintahan",
                "Hukum dan HAM",
                "Ketahanan Nasional"
        );

    }
}
