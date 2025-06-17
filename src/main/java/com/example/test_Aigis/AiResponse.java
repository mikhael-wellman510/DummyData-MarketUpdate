package com.example.test_Aigis;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder(toBuilder = true)
public class AiResponse {

    private String response;
    private List<String> source;
    private String session_id;
    private String message_id;
    private String intent;
    private Boolean is_complete;

}
