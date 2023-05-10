package com.spring.mongodb_springboot.config;

import com.google.api.client.util.Value;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@Configuration
public class FirebaseConfig {
    @Value("${FIREBASE_CONFIG}")
    private String firebaseConfig;

    @Bean
    public void initializeFirebase() throws IOException {
        FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(new ByteArrayInputStream(firebaseConfig.getBytes())))
                .build();
        FirebaseApp.initializeApp(options);
    }
}

