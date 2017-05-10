package com.selam.web.controllers;

import com.selam.backend.service.EmailService;
import com.selam.web.domain.frontend.FeedbackPojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Bereketdeb on 5/8/2017.
 */
@Controller
public class ContactController {

    /** the key which identifies the feedback payload in the model */
    public static final String FEEDBACK_MODEL_KEY = "feedback";
    /** the contact us view name */
    public static final String CONTACT_US_VIEW_NAME = "contact/contact"; //contact directory/contact.html
    /** The Application logger */
    private static final Logger LOG = LoggerFactory.getLogger(ContactController.class);

    @Autowired
    private EmailService emailService;

    @RequestMapping(value="/contact", method= RequestMethod.GET)
    public String contactGet(ModelMap model){ //THIS METHOD HAS TO SEND EMPTY FEEDBACK POJO
        FeedbackPojo feedbackPojo = new FeedbackPojo();
        model.addAttribute(ContactController.FEEDBACK_MODEL_KEY, feedbackPojo);

        return ContactController.CONTACT_US_VIEW_NAME;
    }

    @RequestMapping(value="/contact", method= RequestMethod.POST)
    public String contactPost(@ModelAttribute(FEEDBACK_MODEL_KEY) FeedbackPojo feedback){
        LOG.debug("feedback POJO content: {}", feedback);
        emailService.sendFeedbackEmail(feedback);
        return ContactController.CONTACT_US_VIEW_NAME;
    }
}
