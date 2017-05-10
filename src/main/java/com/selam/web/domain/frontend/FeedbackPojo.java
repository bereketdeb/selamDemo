package com.selam.web.domain.frontend;

import java.io.Serializable;

/**
 * Created by Bereketdeb on 5/8/2017.
 */
public class FeedbackPojo implements Serializable {
    public static final long serialVersionUTD=1L;

    private String firstName;
    private String lastName;
    private String email;
    private String feedback;

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FeedbackPojo{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", feedback='").append(feedback).append('\'');
        sb.append('}');
        return sb.toString();
    }
}