package com.AInutricao.model;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

public record Credencial(
        String login,
        String senha
) {
    public String getEmail() {
        return login;
    }

    public Authentication converter() {
        return new UsernamePasswordAuthenticationToken(login, senha);
    }
}
