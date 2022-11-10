package com.kt.devManager.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SignIn {

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request{
        @NotNull
        @Size(min = 5, max = 10, message = "username size must 5~10")
        private String username;

        @NotNull
        @NotEmpty
        @Size(min = 8, max = 20, message = "memberId size must 8~20")
        private String password;
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response{
        @NotNull
        private String authToken;
    }
}
