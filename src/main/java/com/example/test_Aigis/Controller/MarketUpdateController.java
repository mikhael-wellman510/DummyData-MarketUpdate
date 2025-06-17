package com.example.test_Aigis.Controller;

import com.example.test_Aigis.MarketUpdate.MarketUpdate;
import com.example.test_Aigis.Service.MarketUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MarketUpdateController {

    private final MarketUpdateService marketUpdateService;

    @GetMapping("/marketUpdate")
    public ResponseEntity<?>marketUpdateController(){

        var marketUpdate = marketUpdateService.marketUpdate();

        return ResponseEntity.ok(marketUpdate);
    }

}
