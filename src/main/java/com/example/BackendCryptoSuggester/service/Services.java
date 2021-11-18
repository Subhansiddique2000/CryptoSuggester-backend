package com.example.BackendCryptoSuggester.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Services {
    @Bean
    public RestTemplate getRestTemplate (){
        return new RestTemplate();
    }
}
