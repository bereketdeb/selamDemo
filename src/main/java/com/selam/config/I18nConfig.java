package com.selam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * Created by Bereketdeb on 5/7/2017.
 */
@Configuration
public class I18nConfig{

    @Bean // we are declareing our bean here. N.B the method name must be messageSource.
    public ReloadableResourceBundleMessageSource messageSource(){
        ReloadableResourceBundleMessageSource resourceBundelMessageSource = new ReloadableResourceBundleMessageSource();
        resourceBundelMessageSource.setBasename("classpath:i18n/messages");
        //checks for new messages every 30 minutes
        resourceBundelMessageSource.setCacheSeconds(1800);
        return resourceBundelMessageSource;
    }
}
