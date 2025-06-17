package com.example.test_Aigis.Controller;

import com.example.test_Aigis.Service.MarketUpdatedService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MarketUpdatedController {

    private final MarketUpdatedService marketUpdatedService;

    @GetMapping("/marketUpdate")
    public ResponseEntity<?>marketUpdate(){

        var data = marketUpdatedService.marketUpdatesNew();

        return ResponseEntity.ok(data);
    }

}
