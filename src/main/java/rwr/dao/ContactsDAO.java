package rwr.dao;

import rwr.exceptions.*;
import rwr.model.Contact;
import rwr.model.contact.Address;
import rwr.model.contact.Email;
import rwr.model.contact.IMS;
import rwr.model.contact.Phone;

import java.util.List;

public interface ContactsDAO {

    List<Contact> getAllContacts(Integer candidateId) throws IdException;

    //****  EMAIL   ****//

    Email getEmail(Integer candidateId) throws IdException;

    void updateEmail(Email email) throws EmailException;

    void insertEmail(Email email) throws EmailException;

    void removeEmail(Integer candidateId) throws IdException;

    //****  ADDRESS ****//

    Address getAddress(Integer candidateId) throws IdException;

    void updateAddress(Address address) throws AddressException;

    void insertAddress(Address address) throws AddressException;

    void removeAddress(Integer candidateId) throws IdException;

    //****   PHONE  ****//

    Phone getPhone(Integer candidateId) throws IdException;

    void updatePhone(Phone phone) throws PhoneException;

    void insertPhone(Phone phone) throws PhoneException;

    void removePhone(Integer candidateId) throws IdException;

    //****  IMS (instant messaging system) ****//

    IMS getIms(Integer candidateId) throws IdException;

    void updateIMS(IMS ims) throws IMSException;

    void insertIMS(IMS ims) throws IMSException;

    void removeIMS(Integer candidateId) throws IdException;

}
