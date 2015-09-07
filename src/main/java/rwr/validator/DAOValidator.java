package rwr.validator;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import rwr.exceptions.*;
import rwr.model.Candidate;
import rwr.model.Skill;
import rwr.model.contact.Address;
import rwr.model.contact.Email;
import rwr.model.contact.IMS;
import rwr.model.contact.Phone;

@Service("DAOValidator")
public class DAOValidator {

    private static final Logger logger = LogManager.getLogger("DAOValidator");


    //      ID VALIDATOR

    public void idValidate(Integer id) throws IdException {
        if (id == null) {
            throw new IdException("Candidate id can not be 'null'.");
        }
        if (id < 1) {
            throw new IdException("Candidate id can not be less than 1.");
        }
        logger.debug("Id validation for id: %s passed.", id);
    }

    //      PAGE VALIDATOR

    public void pageValidate(Integer page) throws PageException {
        if ((page == null) || (page < 1)) {
            throw new PageException("Page can not be 'null' or less than 1.");
        }
        logger.debug("Page validation passed.");
    }

    //      CANDIDATE VALIDATOR

    public void candidateValidate(Candidate candidate) throws CandidateException {
        if (candidate == null) {
            throw new CandidateException("Candidate to insert or update can not be 'null'.");
        }
        if ((candidate.getFirstName() == null || candidate.getFirstName().length() < 2)) {
            throw new CandidateException("Candidate's new first name is 'null' or to short.");
        }
        if ((candidate.getLastName() == null || candidate.getFirstName().length() < 2)) {
            throw new CandidateException("Candidate's new last name is 'null' or to short.");
        }
        logger.debug("Candidate validation for id: %s passed.", candidate.getCandidateId());
    }

    //      CONTACTS VALIDATORS


    public void addressValidator(Address address) throws AddressException {
        if (address == null) {
            throw new AddressException("Address can not be 'null'.");
        }
        logger.debug("Address validation passed for id: %s", address.getAddressId());
    }

    public void emailValidate(Email email) throws EmailException {
        if (email == null) {
            throw new EmailException("Email can not be 'null'.");
        }
        if ((email.getEmailAddr() == null) && (email.getAltEmail() == null)) {
            throw new EmailException("Email addresses can not be 'null'.");
        }
        logger.debug("Email validation for id: %s, passed.", email.getEmailId());

    }

    public void phoneValidate(Phone phone) throws PhoneException {
        if (phone == null) {
            throw new PhoneException("Phone can not be 'null'.");
        }
        if ((phone.getPhoneNumber() == null) && (phone.getAltPhoneNumber() == null)) {
            throw new PhoneException("Phone numbers can not be 'null'.");
        }
        logger.debug("Phone validation for %s,  passed.", phone.getPhoneId());
    }

    public void imsValidate(IMS ims) throws IMSException {
        if (ims == null) {
            throw new IMSException("IMS can not be 'null'.");
        }
        logger.debug("IMS validation for id: %s passed", ims.getImsId());
    }

    //      SKILL VALIDATOR


    public void skillValidate(Skill skill) throws SkillException {
        if(skill == null){
            throw new SkillException("Skill can not be 'null'.");
        }
        if(skill.getSkillName()==null){
            throw new SkillException("Skill name can not be 'null'.");
        }
        logger.debug("Skill validation for id: %s passed", skill.getSkillId());
    }
}
