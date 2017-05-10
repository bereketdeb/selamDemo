package com.selam.config;

import com.selam.backend.service.EmailService;
import com.selam.backend.service.SmtpEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Bereketdeb on 5/9/2017.
 */

@Configuration
@Profile("prod")
@PropertySource("file:///${user.home}/selam/selamdemo/.selamdemo/application-prod.properties")
public class ProductionConfig {


    @Bean
    public EmailService emailService(){
        return new SmtpEmailService();
    }
}
