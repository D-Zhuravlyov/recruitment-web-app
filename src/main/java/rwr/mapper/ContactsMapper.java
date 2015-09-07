package rwr.mapper;

import rwr.model.Contact;
import rwr.model.contact.Address;
import rwr.model.contact.Email;
import rwr.model.contact.IMS;
import rwr.model.contact.Phone;

import java.util.List;

public interface ContactsMapper {


    List<Contact> getAllContacts(Integer candidateId);

    //****  EMAIL  ****//

    Email getEmail(Integer candidateId);

    void updateEmail(Email email);

    void insertEmail(Email email);

    void removeEmail(Integer candidateId);

    //****  ADDRESS ****//

    Address getAddress(Integer candidateId);

    void updateAddress(Address address);

    void insertAddress(Address address);

    void removeAddress(Integer candidateId);

    //****  PHONE  ****//

    Phone getPhone(Integer candidateId);

    void updatePhone(Phone phone);

    void insertPhone(Phone phone);

    void removePhone(Integer candidateId);

    //****  IMS (instant messaging system) ****//

    IMS getIms(Integer candidateId);

    void updateIMS(IMS ims);

    void insertIMS(IMS ims);

    void removeIMS(Integer candidateId);


}
