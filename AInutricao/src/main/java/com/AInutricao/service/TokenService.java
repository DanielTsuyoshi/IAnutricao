package com.AInutricao.service;

import com.AInutricao.model.Credencial;
import com.AInutricao.model.User;
import com.AInutricao.model.Token;
import com.AInutricao.repository.UserRepository;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

@Service
public class TokenService {

    @Autowired
    private UserRepository userRepository;

    public Token generateToken(Credencial credential) {
        User user = userRepository.findByEmail(credential.getEmail());
        if (user == null) {
            throw new UsernameNotFoundException("Usuário não encontrado");
        }

        Algorithm algorithm = Algorithm.HMAC256("meusecret");
        String jwt = JWT.create()
                .withSubject(credential.getEmail())
                .withIssuer("AIShoppingBuddy")
                .withExpiresAt(Instant.now().plus(4, ChronoUnit.HOURS))
                .sign(algorithm);

        return new Token(jwt, "JWT", "Bearer");
    }

    public User validate(String token) {
        Algorithm algorithm = Algorithm.HMAC256("meusecret");

        String email = JWT.require(algorithm)
                .withIssuer("AIShoppingBuddy")
                .build()
                .verify(token)
                .getSubject();

        User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new JWTVerificationException("Usuário não encontrado");
        }

        return user;
    }

    public String getToken(String header) {
        if (header == null || !header.startsWith("Bearer ")) {
            return null;
        }

        return header.replace("Bearer ", "");
    }
}
