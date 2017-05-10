package com.selam.backend.service;

import com.selam.web.domain.frontend.FeedbackPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by Bereketdeb on 5/9/2017.
 */
public abstract class AbstractEmailService implements EmailService {

    protected SimpleMailMessage prepareSimpleMailMessageFromFeedbakPojo(FeedbackPojo feedback){
       SimpleMailMessage message = new SimpleMailMessage();
       message.setTo(defaultToAddress);
       message.setFrom(feedback.getEmail());
       message.setSubject("[DevOps Buddy]: Feedback recieved from"+ feedback.getFirstName()+" "
               + feedback.getLastName()+ "!");
       message.setText(feedback.getFeedback());
       return message;

    }

    @Value("${default.to.address")
    private String defaultToAddress;

    @Override
    public void sendFeedbackEmail(FeedbackPojo feedbackPojo) {
        sendGenericEmailMessage(prepareSimpleMailMessageFromFeedbakPojo(feedbackPojo));
    }


}
