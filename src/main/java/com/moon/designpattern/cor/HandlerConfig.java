package com.moon.designpattern.cor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class HandlerConfig {
    @Bean
    public List<Handler> handlers(RequestValidator requestValidator, PerformingMoneyMovement performingMoneyMovement, PersistData persistData) {
        return Arrays.asList(requestValidator, persistData, performingMoneyMovement);
    }
}
