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

    public List<Category>searchByTitle(String keyword){
//        List<Category>res = title().stream().filter(item -> item.toLowerCase().contains(keyword.toLowerCase())).toList();


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
                    .detail(detail().get(j))
                    .build());
        }

        return cat.stream().filter(item -> item.getTittle().toLowerCase().contains(keyword.toLowerCase())).toList();
    }

    public List<CategoryName>listCategory(){
            List<CategoryName> res = new ArrayList<>();
            int id = 1;
            for (int i = 1 ; i < 5 ; i++){
                res.add(CategoryName.builder()
                                .id(id++)
                                .category("Category " + i)
                                .categoryId("c" + i)
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
                                .detail(detail().get(j))
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

    public List<String> detail() {
        return List.of(
                "Informasi seputar dunia perbankan dan kebijakan moneter.",
                "Topik-topik aktual dari Danantara dan lingkup sosial.",
                "Berita terkini seputar kondisi dan tren ekonomi.",
                "Ulasan mendalam mengenai situasi politik nasional.",
                "Perkembangan terbaru teknologi dan inovasi digital.",
                "Isu dan perkembangan di dunia pendidikan.",
                "Topik kesehatan masyarakat dan medis.",
                "Transportasi umum, infrastruktur, dan kebijakan lalu lintas.",
                "Energi terbarukan, sumber daya alam, dan kebijakan energi.",
                "Perkembangan agrikultur dan isu petani.",
                "Isu lingkungan hidup dan perubahan iklim.",
                "Wisata domestik dan internasional serta rekomendasi destinasi.",
                "Kreativitas anak bangsa dan industri kreatif.",
                "Kabar startup lokal dan global.",
                "Digitalisasi layanan keuangan dan fintech.",
                "Keamanan siber dan data pribadi.",
                "Pembangunan infrastruktur nasional dan proyek strategis.",
                "Perdagangan online dan perkembangan e-commerce.",
                "Tren terbaru di media sosial dan dampaknya.",
                "Perkembangan AI, machine learning, dan big data.",
                "Peluang dan risiko investasi.",
                "Teknologi blockchain dan potensinya.",
                "Program pemerintah dan layanan publik.",
                "Isu hukum, hak asasi manusia, dan peraturan.",
                "Ketahanan nasional dalam berbagai aspek strategis."
        );
    }
}
