package com.codingshuttle.project.lovable_clone.service;

import com.codingshuttle.project.lovable_clone.dto.auth.AuthResponse;
import com.codingshuttle.project.lovable_clone.dto.auth.LoginRequest;
import com.codingshuttle.project.lovable_clone.dto.auth.SignUpRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signup(SignUpRequest request);

    AuthResponse login(LoginRequest request);
}
