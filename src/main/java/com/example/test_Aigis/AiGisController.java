package com.example.test_Aigis;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AiGisController {

    @PostMapping("/testing")
    public SseEmitter test(@RequestBody AiRequest aiRequest) {

        log.info("Kepanggil {} : " , aiRequest );
        SseEmitter emitter = new SseEmitter(0L);

        new Thread(() -> {
            try {
                Random random = new Random();
                int angka = random.nextInt(5) + 1;
                String filePath = "C:\\Users\\Mikhael Wellman\\Documents\\CIMB-AiGis\\test-Aigis\\test-Aigis\\src\\main\\resources\\static\\data" + angka + ".txt";

                AiResponse aiResponse = AiResponse.builder()
                        .source(new ArrayList<>())
                        .session_id("3fcd21e2-538d-4af4-a146-57701934efdc")
                        .message_id("ai-a6371c94-d4d0-4e2c-ae15-fc44b793f6c1")
                        .intent("BOND")
                        .is_complete(false)
                        .build();

                Files.lines(Paths.get(filePath)).forEach(line -> {
                    try {
                        aiResponse.setResponse(line);
                        emitter.send(aiResponse);
                        Thread.sleep(300);
                    } catch (Exception e) {
                        emitter.completeWithError(e);
                    }

                });
                emitter.complete();
            } catch (Exception e) {
                emitter.completeWithError(e);
            }
        }).start();

        return emitter;
    }

    @GetMapping("/cek")
    public String tes(){
        log.info("Kepanggil boy");
        return "Success Boy";
    }

}
