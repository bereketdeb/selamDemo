package com.selam.config;

import com.selam.backend.service.EmailService;
import com.selam.backend.service.MockService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Bereketdeb on 5/9/2017.
 */
@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/selam/selamdemo/.selamdemo/application-dev.properties")
public class DevelopmentConfig {
    @Bean
    public EmailService emailService(){

        return new MockService();

    }
}
