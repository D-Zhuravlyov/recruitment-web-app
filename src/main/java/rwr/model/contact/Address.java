package rwr.model.contact;

import rwr.model.Contact;

public class Address extends Contact {

    private int candidateId;

    private int addressId;
    private String country;
    private String city;
    private String street;
    private String postIndex;

    public Address() {
    }

    public Address(String country, String city, String street, String postIndex) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postIndex = postIndex;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(String postIndex) {
        this.postIndex = postIndex;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postIndex='" + postIndex + '\'' +
                '}';
    }
}
