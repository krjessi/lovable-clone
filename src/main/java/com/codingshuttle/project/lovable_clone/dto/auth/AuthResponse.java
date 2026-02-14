package com.codingshuttle.project.lovable_clone.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {
}
