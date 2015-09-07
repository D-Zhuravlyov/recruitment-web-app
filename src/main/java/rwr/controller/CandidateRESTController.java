package rwr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import rwr.dao.CandidateDAO;
import rwr.exceptions.IdException;
import rwr.model.Candidate;

@Controller
public class CandidateRESTController {

    @Autowired
    private CandidateDAO candidateDAO;


    @RequestMapping(value = "candidates/{id}",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Candidate> getCandidateById(@PathVariable Integer id) throws IdException {
        return new ResponseEntity<Candidate>(candidateDAO.getCandidateById(id), HttpStatus.OK);
    }


}
