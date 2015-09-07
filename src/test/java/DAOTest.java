
import rwr.exceptions.CandidateException;
import rwr.exceptions.IdException;
import rwr.mapper.CandidateMapper;
import rwr.mapper.ContactsMapper;
import rwr.mapper.SkillMapper;
import rwr.model.Candidate;
import rwr.model.Contact;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import rwr.model.Skill;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/test-app-context.xml"})
public class DAOTest {


    @Autowired
    private CandidateMapper candidateDAO;

    @Autowired
    private ContactsMapper contactsDAO;

    @Autowired
    private SkillMapper skillDAO;

    @Test
    public void testGetCandidateById() throws IdException {
        Integer id = 0;
        Candidate candidate = candidateDAO.getCandidateById(id);
        Assert.assertNotNull(candidate);
    }

    @Test(expected = IdException.class)
    public void testGetUserByIdException() throws IdException {
        Integer id = -1;
        candidateDAO.getCandidateById(id);
    }

    @Test
    public void insertCandidates() throws CandidateException {
        int candidateNumber = 5;
        Date date = new Date();
        for (int i = 0; i < candidateNumber; i++) {
            Candidate candidate = new Candidate("First Name" + i, "Last name" + i, 10 + i, date, date);
            candidateDAO.insertCandidate(candidate);
        }
    }


    @Test
    public void testUpdateCandidate() throws IdException, CandidateException {
        Integer id = 1;
        Date date = new Date();
        Candidate candidate = candidateDAO.getCandidateById(id);
        candidate.setFirstName("   ");
        candidate.setLastName("    ");
        candidate.setDateAdded(date);
        candidateDAO.updateCandidate(candidate);
        Candidate updatedCandidate = candidateDAO.getCandidateById(id);
        System.out.println(updatedCandidate);
        Assert.assertEquals(candidate.getFirstName(), updatedCandidate.getFirstName());
        Assert.assertEquals(candidate.getLastName(), updatedCandidate.getLastName());
    }

    @Test(expected = CandidateException.class)
    public void testUpdateCandidateException() throws CandidateException {
        Integer id = 1;
        Candidate candidate = candidateDAO.getCandidateById(id);
        candidate.setFirstName("");
        candidateDAO.updateCandidate(candidate);

    }

    public void removeCandidate() throws CandidateException {
        Integer i = 2;
        candidateDAO.removeCandidate(i);
    }

    @Test(expected = CandidateException.class)
    public void removeCandidateException() throws CandidateException {
        Integer i = -1;
        candidateDAO.removeCandidate(i);

    }

    @Test
    public void getAllCandidatesAcsByNamePageTwo() {
        List<Candidate> candidates = candidateDAO.getAllCandidatesAcsByFirstName(2);
        for (Candidate c : candidates) {
            System.out.println(c);
        }

    }

    @Test
    public void testGetAllContacts() throws IdException {
        Integer id = 1;
        List<Contact> contacts = contactsDAO.getAllContacts(id);
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

    @Test
    public void testGetEmail() {
        Integer id = 1;
        Contact email = contactsDAO.getEmail(id);
        System.out.println(email);
    }

    @Test
    public void testGetAllSkills() {
        Integer id = 1;
        List<Skill> skills = skillDAO.getSkills(id);
        for (Skill s : skills) {
            System.out.println(s);
        }
    }

}


