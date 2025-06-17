package com.example.test_Aigis.Service;

import com.example.test_Aigis.Dto.Data;
import com.example.test_Aigis.Dto.IndicativeRatesDto;
import com.example.test_Aigis.Dto.MarketDto;
import com.example.test_Aigis.Dto.MarketUpdate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MarketUpdatedService {

   public MarketUpdate marketUpdatesNew(){

       String url = "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf";
       return MarketUpdate.builder()
               .urlPdf(url)
               .indicativeRatesDto(indicativeRatesDtos())
               .marketDto(marketDtos())
               .build();
   }

    public List<IndicativeRatesDto>indicativeRatesDtos(){

        List<IndicativeRatesDto>res = new ArrayList<>();

        res.add(IndicativeRatesDto.builder()
                .tittle("Cross Rates")
                .data(List.of(
                        Data.builder().currencyPair("AUD/EUR").last("12.33").prevWk("23.55").build(),
                        Data.builder().currencyPair("EUR/IDR").last("10.33").prevWk("21.44").build(),
                        Data.builder().currencyPair("GBP/IDR").last("0.33").prevWk("26.78").build(),
                        Data.builder().currencyPair("INR/IDR").last("2.53").prevWk("80.55").build(),
                        Data.builder().currencyPair("SGD/IDR").last("12.33").prevWk("93.55").build()
                ))
                .build());

        res.add(IndicativeRatesDto.builder()
                .tittle("Interest Rates")
                .data(List.of(
                        Data.builder().currencyPair("BI RATES").last("0.45").prevWk("2.44").build(),
                        Data.builder().currencyPair("1M IDR Interbank").last("1.56").prevWk("3.44").build(),
                        Data.builder().currencyPair("Id Inflation").last("0.75").prevWk("1.00").build(),
                        Data.builder().currencyPair("USD Fed funds").last("0.25").prevWk("4.44").build()
                ))
                .build());

        res.add(IndicativeRatesDto.builder()
                .tittle("Spot Rates")
                .data(List.of(
                        Data.builder().currencyPair("AUD/EUR").last("0.65").prevWk("0.66").build(),
                        Data.builder().currencyPair("EUR/USD").last("0.24").prevWk("0.89").build(),
                        Data.builder().currencyPair("GBP/USD").last("1.23").prevWk("2.45").build(),
                        Data.builder().currencyPair("USD/JPY").last("4.66").prevWk("34.00").build()
                ))
                .build());
        return res;
    }
    public List<MarketDto> marketDtos(){

        List<MarketDto> data = new ArrayList<>();

        data.add(MarketDto.builder()
                .tittle("Market Sumary")
                .data(List.of(
                        "Lonjakan impor di Amerika Serikat (AS) xxxx",
                        "Rentang perdagangan USD/IDR xxxx",
                        "Pasar Obligasi Negara Indonesia xxxx",
                        "Arus dana asing xxxx"
                ))
                .allData(List.of(
                        "Lonjakan impor di Amerika Serikat (AS) terjadi menjelang kenaikan tarif dan menyebabkan neraca perdagangan mengalami defisit terbesar sepanjang masa. Pada Januari 2025, impor AS mencapai USD 402,1 miliar dan defisit perdagangan sebesar USD 91,5 miliar. Sebagai perbandingan, impor barang Indonesia pada saat yang sama sebesar USD 18 miliar atau kurang dari 5%. AS sempat tutup lebih dari 5% pada sesi sebelumnya, sejak 5 November 2024.",
                        "Rentang perdagangan USD/IDR pada hari ini diperkirakan antara 16.100 – 16.400. Pada hari Kamis lalu, JISDOR Bank Indonesia berada di kisaran 16.250.",
                        "Pasar Obligasi Negara Indonesia ditutup pada yield penutupan hari Kamis adalah 6,37% (1Y), 6,52% (3Y), 6,77% (5Y), 6,82% (10Y) dan 6,92% (15Y), sedangkan premi credit default swap (CDS) tenor 5 tahun berada di 84 bps.",
                        "Arus dana asing dan penutupan indeks reksadana real estat terpantau ada tekanan. Indeks saham AS naik di tengah kenaikan biaya tenaga kerja dan suku bunga. Di pasar Indonesia, investor asing melakukan net sell senilai IDR 3,7 miliar, dan IDR 21,5 miliar, kepemilikan asing pada obligasi pemerintah naik IDR 544 miliar pada perdagangan 5 Maret 2025."
                ))
                .build());

        data.add(MarketDto.builder()
                .tittle("Domestic News Update")
                .data(List.of(
                        "Harga Tandan Pangan Segar (TBS) ditetapkan sebesar Rp3.757 per KG, berlaku mulai 1 Maret 2025. Ini merupakan harga tertinggi yang tercatat di Indonesia",
                        "Mendag angkat bicara terkait kontroversi viral TikTok soal volume Minyakita: seharusnya 1 liter, bukan 750 ml.",
                        "Indonesia tetap berkomitmen untuk memperkuat kerja sama ekonomi dan perdagangan dengan semua negara, termasuk AS, di tengah perang dagang yang masih berlangsung.\n"
                ))
                .allData(List.of(
                        "Penetapan harga Tandan Buah Segar (TBS) sebesar Rp3.757 per kilogram mulai 1 Maret 2025 mencerminkan kebijakan penting yang berdampak luas, baik dari segi ekonomi, sosial, maupun industri. Harga ini merupakan yang tertinggi dalam sejarah industri sawit Indonesia, dan menjadi indikator bahwa nilai komoditas kelapa sawit masih sangat strategis, baik di pasar domestik maupun internasional.\n\n" +
                                "Kebijakan ini memberikan angin segar bagi para petani kelapa sawit, khususnya petani rakyat yang selama ini sangat bergantung pada harga TBS sebagai sumber pendapatan utama. Dengan harga yang tinggi, para petani diharapkan dapat meningkatkan taraf hidupnya, memperbaiki kesejahteraan keluarga, serta memiliki modal lebih baik untuk merawat dan meningkatkan produktivitas kebun mereka. Selain itu, harga yang adil juga menjadi bentuk penghargaan terhadap kerja keras mereka dalam menjaga rantai pasok minyak sawit."
                ))
                .build());

        data.add(MarketDto.builder()
                .tittle("Global News Updates")
                .data(List.of(
                        "Presiden Trump menunda tarif barang USMCA hingga 2 April, sehingga membebaskan mobil, suku cadang, dan kalium (yang banyak digunakan untuk pupuk) dari bea masuk yang tinggi.",
                        "Malaysia menyetujui kontribusi EPF pekerja asing sebesar 2% mulai 4025.",
                        "Kelompok Thailand mendesak strategi proaktif untuk mengurangi dampak kebijakan perdagangan AS.\n"
                ))
                .allData(List.of(
                        "Keputusan Presiden Trump untuk menunda tarif hingga 2 April 2025 mencerminkan pendekatan yang lebih hati-hati terhadap kebijakan perdagangan luar negeri. Dengan menangguhkan bea masuk terhadap mobil, suku cadang, dan kalium, pemerintahan AS berupaya melindungi ekonomi domestik dari lonjakan harga, mendukung stabilitas sektor pertanian dan otomotif, serta membuka ruang negosiasi lebih lanjut dengan mitra dagang utama seperti Meksiko dan Kanada. Kebijakan ini juga bisa dipandang sebagai sinyal bahwa AS masih menghargai stabilitas kerja sama regional di tengah meningkatnya proteksionisme global."
                ))
                .build());

        data.add(MarketDto.builder()
                .tittle("Fixed Income")
                .data(List.of("Tidak ada pembaruan hari ini."))
                .allData(List.of("Pada hari ini, tidak terdapat pembaruan informasi mengenai instrumen pendapatan tetap seperti obligasi pemerintah, sukuk, maupun surat utang korporasi. Hal ini menunjukkan bahwa pasar obligasi dalam kondisi stabil atau belum ada rilis data baru dari otoritas atau pelaku pasar."))
                .build());
        return data;
    }

}
