package com.kt.devManager.controller;

import com.kt.devManager.dto.SignIn;
import com.kt.devManager.dto.SignUp;
import com.kt.devManager.service.AuthService;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@RestController
@Slf4j
@RequiredArgsConstructor
//@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {
    private final AuthService signInService;

    @GetMapping("/")
    public String root(){
        log.info("GET / HTTP/1.1");

        return "Welcome!";
    }

    @PostMapping("/signIn")
    public SignIn.Response signIn(@Valid @RequestBody SignIn.Request request){
        log.info("POST /signIn HTTP/1.1");

        return signInService.signIn(request);
    }

    @PostMapping("/signUp")
    public SignUp.Response signUp(@Valid @RequestBody SignUp.Request request){
        log.info("POST /signUp HTTP/1.1");

        return signInService.signUp(request);
    }
}
