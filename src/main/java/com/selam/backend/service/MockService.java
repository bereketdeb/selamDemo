package com.selam.backend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by Bereketdeb on 5/9/2017.
 */
public class MockService extends AbstractEmailService {
    
    /** The Application logger */
    private static final Logger LOG = LoggerFactory.getLogger(MockService.class);
    @Override
    public void sendGenericEmailMessage(SimpleMailMessage message) {
        LOG.debug("Simulating an email service ....");
        LOG.info(message.toString());
        LOG.debug("Email Sent.");
    }
}
