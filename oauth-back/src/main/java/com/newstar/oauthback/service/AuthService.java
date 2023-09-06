package com.newstar.oauthback.service;

import org.springframework.http.ResponseEntity;

import com.newstar.oauthback.dto.request.auth.SignUpRequestDto;
import com.newstar.oauthback.dto.response.auth.SignUpResponseDto;

public interface AuthService {
    
    ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto);  

}
