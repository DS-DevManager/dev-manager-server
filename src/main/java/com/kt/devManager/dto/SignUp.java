package com.kt.devManager.dto;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SignUp {

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
        @Size(min = 8, max = 20, message = "password size must 8~20")
        private String password;

//        @NotNull
        @Size(min = 3, max = 20, message = "name size must 3~20")
        private String name;

        @Min(18)
        private Integer age;
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
