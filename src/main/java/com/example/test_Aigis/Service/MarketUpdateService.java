package com.example.test_Aigis.Service;

import com.example.test_Aigis.IndicativeRates.CrossRates;
import com.example.test_Aigis.IndicativeRates.IndicativeRates;
import com.example.test_Aigis.IndicativeRates.InterestRates;
import com.example.test_Aigis.IndicativeRates.SpotRates;
import com.example.test_Aigis.MarketUpdate.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MarketUpdateService {

    public MarketUpdate marketUpdate(){



        return MarketUpdate.builder()
                .indicativeRates(indicativeRates())
                .market(market())
                .build();
    }
    Market market(){
        return Market.builder()
                .marketSummary(marketSummary())
                .marketSummaryAll(marketSummaryAll())
                .domesticNewsUpdate(domesticNewsUpdate())
                .globalNewUpdates(globalNewUpdates())
                .fixedIncome(fixedIncome())
                .build();
    }

    MarketSummary marketSummary(){


        return MarketSummary.builder()
                .tittle("Market Sumary")
                .marketSummary(List.of("Lonjakan impor di Amerika Serikat (AS) xxxx","Rentang perdagangan USD/IDR xxxx","Pasar Obligasi Negara Indonesia xxxx","Arus dana asing xxxx"))
                .build();
    }

    MarketSummaryAll marketSummaryAll(){

        return MarketSummaryAll.builder()
                .tittle("Market Summary All")
                .marketSummaryAll(List.of("Lonjakan impor di Amerika Serikat (AS) terjadi menjelang kenaikan tarif dan menyebabkan neraca perdagangan mengalami defisit terbesar sepanjang masa. Pada Januari 2025, impor AS mencapai USD 402,1 miliar dan defisit perdagangan sebesar USD 91,5 miliar. Sebagai perbandingan, impor barang Indonesia pada saat yang sama sebesar USD 18 miliar atau kurang dari 5%. AS sempat tutup lebih dari 5% pada sesi sebelumnya, sejak 5 November 2024.","Rentang perdagangan USD/IDR pada hari ini diperkirakan antara 16.100 – 16.400. Pada hari Kamis lalu, JISDOR Bank Indonesia berada di kisaran 16.250.","Pasar Obligasi Negara Indonesia ditutup pada yield penutupan hari Kamis adalah 6,37% (1Y), 6,52% (3Y), 6,77% (5Y), 6,82% (10Y) dan 6,92% (15Y), sedangkan premi credit default swap (CDS) tenor 5 tahun berada di 84 bps.","Arus dana asing dan penutupan indeks reksadana real estat terpantau ada tekanan. Indeks saham AS naik di tengah kenaikan biaya tenaga kerja dan suku bunga. Di pasar Indonesia, investor asing melakukan net sell senilai IDR 3,7 miliar, dan IDR 21,5 miliar, kepemilikan asing pada obligasi pemerintah naik IDR 544 miliar pada perdagangan 5 Maret 2025."))
                .build();
    }

    DomesticNewsUpdate domesticNewsUpdate(){
        return DomesticNewsUpdate.builder()
                .tittle("Domestic News Update")
                .domesticNewsUpdate(List.of("Harga Tandan Pangan Segar (TBS) ditetapkan sebesar Rp3.757 per KG, berlaku mulai 1 Maret 2025. Ini merupakan harga tertinggi yang tercatat di Indonesia" ,"Mendag angkat bicara terkait kontroversi viral TikTok soal volume Minyakita: seharusnya 1 liter, bukan 750 ml.","Indonesia tetap berkomitmen untuk memperkuat kerja sama ekonomi dan perdagangan dengan semua negara, termasuk AS, di tengah perang dagang yang masih berlangsung.\n" +
                        "\n"))
                .build();
    }

    GlobalNewUpdates globalNewUpdates(){
        return GlobalNewUpdates.builder()
                .tittle("Global News Updates")
                .globalNewsUpdates(List.of("Presiden Trump menunda tarif barang USMCA hingga 2 April, sehingga membebaskan mobil, suku cadang, dan kalium (yang banyak digunakan untuk pupuk) dari bea masuk yang tinggi." ,"Malaysia menyetujui kontribusi EPF pekerja asing sebesar 2% mulai 4025.","Kelompok Thailand mendesak strategi proaktif untuk mengurangi dampak kebijakan perdagangan AS.\n" +
                        "\n"))
                .build();
    }

    FixedIncome fixedIncome(){
        return FixedIncome.builder()
                .tittle("Fixed Income")
                .fixedIncome(List.of("Tidak ada pembaruan hari ini."))
                .build();
    }

    public List<SpotRates> spotRates(){

        List<SpotRates> data = new ArrayList<>();

        data.add(new SpotRates("AUD/EUR", "0.65","0.66" ));
        data.add(new SpotRates("EUR/USD","0.24","0.89"));
        data.add(new SpotRates("GBP/USD","1.23" ,"2.45"));
        data.add(new SpotRates("USD/JPY","4.66","34.00"));




        return data;
    }

    public List<CrossRates> crossRates(){
        List<CrossRates> crossRates = new ArrayList<>();
        crossRates.add(new CrossRates("AUD/EUR","12.33","23.55"));
        crossRates.add(new CrossRates("EUR/IDR","10.33","21.44"));
        crossRates.add(new CrossRates("GBP/IDR","0.33","26.78"));
        crossRates.add(new CrossRates("INR/IDR","2.53","80.55"));
        crossRates.add(new CrossRates("SGD/IDR","12.33","93.55"));
        return crossRates;
    }

    public List<InterestRates> interestRates(){
        List<InterestRates> interestRates = new ArrayList<>();
        interestRates.add(new InterestRates("BI RATES" ,"0.45" , "2.44"));
        interestRates.add(new InterestRates("1M IDR Interbank" ,"1.56" , "3.44"));
        interestRates.add(new InterestRates("Id Inflation" ,"0.75" , "1.00"));
        interestRates.add(new InterestRates("USD Fed funds" ,"0.25" , "4.44"));
        return interestRates;
    }

    public IndicativeRates indicativeRates(){
        List<SpotRates>spotRates = spotRates();
        List<CrossRates> crossRates = crossRates();
        List<InterestRates> interestRates = interestRates();

        return IndicativeRates.builder()
                .crossRates(crossRates)
                .interestRates(interestRates)
                .spotRates(spotRates)
                .build();
    }
}
