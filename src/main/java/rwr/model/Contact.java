package rwr.model;

import rwr.model.contact.Address;
import rwr.model.contact.Email;
import rwr.model.contact.IMS;
import rwr.model.contact.Phone;


public class Contact {

    private Email email;
    private Phone phone;
    private Address address;
    private IMS ims;

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public IMS getIms() {
        return ims;
    }

    public void setIms(IMS ims) {
        this.ims = ims;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "email=" + email +
                ", phone=" + phone +
                ", address=" + address +
                ", ims=" + ims +
                '}';
    }
}
