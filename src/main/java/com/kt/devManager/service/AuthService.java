package com.kt.devManager.service;

import com.kt.devManager.dto.SignIn;
import com.kt.devManager.dto.SignUp;
import com.kt.devManager.entity.User;
import com.kt.devManager.repository.AuthRepository;
import lombok.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthRepository authRepository;

    @Transactional
    public SignIn.Response signIn(@Valid SignIn.Request request) {
        List<User> userList = authRepository.authenticate(request.getUsername(), request.getPassword());

        SignIn.Response response = SignIn.Response.builder()
                .authToken("")
                .build();

        if(userList.size() == 1){
            response.setAuthToken("sampleToken");
        }

        return response;
    }

    @Transactional
    public SignUp.Response signUp(@Valid SignUp.Request request){
        String authToken = "sampleToken";

        User user = User.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .authToken(authToken)
                .build();

        authRepository.save(user);

        return SignUp.Response.builder()
                .authToken(authToken)
                .build();
    }
}
