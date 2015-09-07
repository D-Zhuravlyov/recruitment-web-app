package rwr.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rwr.exceptions.*;
import rwr.mapper.ContactsMapper;
import rwr.model.Contact;
import rwr.model.contact.Address;
import rwr.model.contact.Email;
import rwr.model.contact.IMS;
import rwr.model.contact.Phone;
import rwr.validator.DAOValidator;

import java.util.List;

@Transactional
@Service("ContactsDAO")
public class ContactsDAOImpl implements ContactsDAO {

    @Autowired
    private ContactsMapper contactsMapper;

    @Autowired
    DAOValidator daoValidator;

    private static final Logger logger = LogManager.getLogger("ContactsDAO");

    //      ALL CONTACTS

    public List<Contact> getAllContacts(Integer candidateId) throws IdException {
        daoValidator.idValidate(candidateId);
        logger.debug("Returning all contacts of candidate with id: %s.", candidateId);
        return contactsMapper.getAllContacts(candidateId);
    }

    //      EMAIL

    public Email getEmail(Integer candidateId) throws IdException {
        daoValidator.idValidate(candidateId);
        logger.debug("Returning email of candidate with id: %s.", candidateId);
        return contactsMapper.getEmail(candidateId);
    }

    public void updateEmail(Email email) throws EmailException {
        daoValidator.emailValidate(email);
        logger.debug("Updating email with id: %s.", email.getEmailId());
        contactsMapper.updateEmail(email);
    }

    public void insertEmail(Email email) throws EmailException {
        daoValidator.emailValidate(email);
        logger.debug("Inserting email with id: %s.", email.getEmailId());
        contactsMapper.insertEmail(email);
    }

    public void removeEmail(Integer candidateId) throws IdException {
        daoValidator.idValidate(candidateId);
        logger.debug("Removing email of candidate: %s.", candidateId);
        contactsMapper.removeEmail(candidateId);
    }

    //      ADDRESS

    public Address getAddress(Integer candidateId) throws IdException {
        daoValidator.idValidate(candidateId);
        logger.debug("Returning address of candidate with id: %s.", candidateId);
        return contactsMapper.getAddress(candidateId);
    }

    public void updateAddress(Address address) throws AddressException {
        daoValidator.addressValidator(address);
        logger.debug("Updating address with id: %s.", address.getAddressId());
        contactsMapper.updateAddress(address);
    }

    public void insertAddress(Address address) throws AddressException {
        daoValidator.addressValidator(address);
        logger.debug("Inserting address with id: %s.", address.getAddressId());
        contactsMapper.insertAddress(address);
    }

    public void removeAddress(Integer candidateId) throws IdException {
        daoValidator.idValidate(candidateId);
        logger.debug("Removing address of candidate: %s.", candidateId);
        contactsMapper.removeAddress(candidateId);
    }

    //      PHONE

    public Phone getPhone(Integer candidateId) throws IdException {
        daoValidator.idValidate(candidateId);
        logger.debug("Returning phone of candidate with id: %s.", candidateId);
        return contactsMapper.getPhone(candidateId);
    }

    public void updatePhone(Phone phone) throws PhoneException {
        daoValidator.phoneValidate(phone);
        logger.debug("Updating phone with id: %s.", phone.getPhoneId());
        contactsMapper.updatePhone(phone);
    }

    public void insertPhone(Phone phone) throws PhoneException {
        daoValidator.phoneValidate(phone);
        logger.debug("Inserting phone with id: %s.", phone.getPhoneId());
        contactsMapper.insertPhone(phone);
    }

    public void removePhone(Integer candidateId) throws IdException {
        daoValidator.idValidate(candidateId);
        logger.debug("Removing phone of candidate: %s.", candidateId);
        contactsMapper.removePhone(candidateId);
    }

    //      IMS (instant messaging system)
    public IMS getIms(Integer candidateId) throws IdException {
        daoValidator.idValidate(candidateId);
        logger.debug("Returning IMS of candidate with id: %s.", candidateId);
        return contactsMapper.getIms(candidateId);
    }

    public void updateIMS(IMS ims) throws IMSException {
        daoValidator.imsValidate(ims);
        logger.debug("Updating IMS with id: %s.", ims.getImsId());
        contactsMapper.updateIMS(ims);
    }

    public void insertIMS(IMS ims) throws IMSException {
        daoValidator.imsValidate(ims);
        logger.debug("Inserting IMS with id: %s.", ims.getImsId());
        contactsMapper.insertIMS(ims);
    }

    public void removeIMS(Integer candidateId) throws IdException {
        daoValidator.idValidate(candidateId);
        logger.debug("Removing IMS of candidate: %s.", candidateId);
        contactsMapper.removeIMS(candidateId);
    }
}
