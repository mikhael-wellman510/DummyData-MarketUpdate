package com.example.test_Aigis;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class AiRequest {

    private String query;
    private String user_id;
    private String session_id;
    private String message_id;

}
