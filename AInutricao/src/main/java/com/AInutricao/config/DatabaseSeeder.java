package com.AInutricao.config;

import com.AInutricao.model.User;
import com.AInutricao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    private UserRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {
    }
}
