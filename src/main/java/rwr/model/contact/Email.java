package rwr.model.contact;

import rwr.model.Contact;

public class Email extends Contact {

    private int candidateId;

    private int emailId;

    @org.hibernate.validator.constraints.Email
    private String emailAddr;

    @org.hibernate.validator.constraints.Email
    private String altEmail;

    public Email() {
    }

    public Email(String emailAddr, String altEmail) {
        this.emailAddr = emailAddr;
        this.altEmail = altEmail;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getAltEmail() {
        return altEmail;
    }

    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
    }

    public int getEmailId() {
        return emailId;
    }

    public void setEmailId(int emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Email{" +
                "emailAddr='" + emailAddr + '\'' +
                ", altEmail='" + altEmail + '\'' +
                '}';
    }
}
