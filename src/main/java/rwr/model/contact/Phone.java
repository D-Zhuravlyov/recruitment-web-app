package rwr.model.contact;

import rwr.model.Contact;


public class Phone extends Contact {

    private int candidateId;

    private int phoneId;
    private String phoneNumber;
    private String altPhoneNumber;

    public Phone() {
    }

    public Phone(String phoneNumber, String altPhoneNumber) {
        this.phoneNumber = phoneNumber;
        this.altPhoneNumber = altPhoneNumber;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAltPhoneNumber() {
        return altPhoneNumber;
    }

    public void setAltPhoneNumber(String altPhoneNumber) {
        this.altPhoneNumber = altPhoneNumber;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", altPhoneNumber='" + altPhoneNumber + '\'' +
                '}';
    }
}
