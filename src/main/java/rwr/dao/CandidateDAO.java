package rwr.dao;

import rwr.exceptions.CandidateException;
import rwr.exceptions.IdException;
import rwr.exceptions.PageException;
import rwr.model.Candidate;

import java.util.List;

public interface CandidateDAO {

    Candidate getCandidateById(Integer candidateId) throws IdException;

    List<Candidate> getAllCandidatesDescByDate(Integer page) throws PageException;

    List<Candidate> getAllCandidatesAcsByDate(Integer page) throws PageException;

    List<Candidate> getAllCandidatesDescByFirstName(Integer page) throws PageException;

    List<Candidate> getAllCandidatesDescByLastName(Integer page) throws PageException;

    List<Candidate> getAllCandidatesAcsByFirstName(Integer page) throws PageException;

    List<Candidate> getAllCandidatesAcsByLastName(Integer page) throws PageException;

    List<Candidate> getAllCandidates();

    int getRowsCount();

    void insertCandidate(Candidate candidate) throws CandidateException;

    void updateCandidate(Candidate candidate) throws CandidateException;

    void removeCandidate(Integer contactsId) throws IdException;

}
