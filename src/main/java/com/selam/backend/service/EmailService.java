package com.selam.backend.service;

import com.selam.web.domain.frontend.FeedbackPojo;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by Bereketdeb on 5/9/2017.
 * contract for email service
 */
public interface EmailService {
    /**
     * send an email with the content in the feedback pojo.
     * @param pojo the feedback pojo
     */
    void sendFeedbackEmail(FeedbackPojo pojo);
    /**
     * send an email with the content in the simple mail message object.
     * @param message the object containing the email content
     */
    void sendGenericEmailMessage(SimpleMailMessage message);
}
