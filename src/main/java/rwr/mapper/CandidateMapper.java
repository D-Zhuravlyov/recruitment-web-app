package rwr.mapper;

import rwr.model.Candidate;

import java.util.List;

public interface CandidateMapper {

    Candidate getCandidateById(Integer candidateId);

    List<Candidate> getAllCandidatesDescByDate(Integer page);

    List<Candidate> getAllCandidatesAcsByDate(Integer page);

    List<Candidate> getAllCandidatesDescByFirstName(Integer page);

    List<Candidate> getAllCandidatesDescByLastName(Integer page);

    List<Candidate> getAllCandidatesAcsByFirstName(Integer page);

    List<Candidate> getAllCandidatesAcsByLastName(Integer page);

    List<Candidate> getAllCandidates();

    int getRowsCount();

    void insertCandidate(Candidate candidate);

    void updateCandidate(Candidate candidate);

    void removeCandidate(Integer candidateId);

}
