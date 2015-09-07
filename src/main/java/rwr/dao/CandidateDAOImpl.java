package rwr.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rwr.exceptions.CandidateException;
import rwr.exceptions.IdException;
import rwr.exceptions.PageException;
import rwr.mapper.CandidateMapper;
import rwr.model.Candidate;
import rwr.validator.DAOValidator;

import java.util.Date;
import java.util.List;

@Transactional
@Service("CandidateDAO")
public class CandidateDAOImpl implements CandidateDAO {

    @Autowired
    private CandidateMapper candidateMapper;

    @Autowired
    private DAOValidator daoValidator;

    private static final Logger logger = LogManager.getLogger("CandidateDAO");

    private Integer pageSize = 20;

    public Candidate getCandidateById(Integer candidateId) throws IdException {
        daoValidator.idValidate(candidateId);
        logger.debug("Returning candidate %s.", candidateId);
        return candidateMapper.getCandidateById(candidateId);
    }

    public List<Candidate> getAllCandidatesDescByDate(Integer page) throws PageException {
        daoValidator.pageValidate(page);
        page *= pageSize;
        logger.debug("Returning candidates DESC by date, page: %s.",page );
        return candidateMapper.getAllCandidatesDescByDate(page);
    }

    public List<Candidate> getAllCandidatesAcsByDate(Integer page) throws PageException {
        daoValidator.pageValidate(page);
        page *= pageSize;
        logger.debug("Returning candidates ASC by date, page: %s.",page );
        return candidateMapper.getAllCandidatesAcsByDate(page);
    }

    public List<Candidate> getAllCandidatesDescByFirstName(Integer page) throws PageException {
        daoValidator.pageValidate(page);
        page *= pageSize;
        logger.debug("Returning candidates DESC by first name, page: %s.",page );
        return candidateMapper.getAllCandidatesDescByFirstName(page);
    }

    public List<Candidate> getAllCandidatesAcsByFirstName(Integer page) throws PageException {
        daoValidator.pageValidate(page);
        page *= pageSize;
        logger.debug("Returning candidates ASC by first name, page: %s.",page );
        return candidateMapper.getAllCandidatesAcsByFirstName(page);
    }

    public List<Candidate> getAllCandidatesDescByLastName(Integer page) throws PageException {
        daoValidator.pageValidate(page);
        page *= pageSize;
        logger.debug("Returning candidates DESC by last name, page: %s.",page );
        return candidateMapper.getAllCandidatesDescByLastName(page);
    }

    public List<Candidate> getAllCandidatesAcsByLastName(Integer page) throws PageException {
        daoValidator.pageValidate(page);
        page *= pageSize;
        logger.debug("Returning candidates ASC by last name, page: %s.",page );
        return candidateMapper.getAllCandidatesAcsByLastName(page);
    }

    public List<Candidate> getAllCandidates() {
        logger.debug("Returning ALL CANDIDATES.");
        return candidateMapper.getAllCandidates();
    }

    public void insertCandidate(Candidate candidate) throws CandidateException {
        daoValidator.candidateValidate(candidate);
        Date date = new Date();
        candidate.setDateAdded(date);
        logger.debug("Inserting candidate with id: %s", candidate.getCandidateId());
        candidateMapper.insertCandidate(candidate);
    }

    public void updateCandidate(Candidate candidate) throws CandidateException {
        daoValidator.candidateValidate(candidate);
        logger.debug("Updating candidate with id: %s", candidate.getCandidateId());
        candidateMapper.updateCandidate(candidate);
    }

    public void removeCandidate(Integer candidateId) throws IdException {
        daoValidator.idValidate(candidateId);
        logger.debug("Removing candidate with id: %s", candidateId);
        candidateMapper.removeCandidate(candidateId);
    }

    public int getRowsCount(){
        logger.debug("Getting total number of rows in CANDIDATE table");
        return candidateMapper.getRowsCount();
    }


}
