package com.siteactivityreportingservice.ayorindeadunse.com.ayorindeadunse.Responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApiResponse {
    private Boolean success;
    private String message;
    private Object data;
}
