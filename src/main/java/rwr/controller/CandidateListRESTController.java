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
import org.springframework.web.servlet.ModelAndView;
import rwr.dao.CandidateDAO;
import rwr.exceptions.PageException;
import rwr.model.Candidate;

import java.util.List;


@Controller
public class CandidateListRESTController {

    @Autowired
    CandidateDAO candidateDAO;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getPages() {

        return new ModelAndView("index");

    }

    @RequestMapping(value = "candidates/",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity <List<Candidate>> getAllCandidates() throws PageException {
        return new ResponseEntity <List<Candidate>> (candidateDAO.getAllCandidatesDescByDate(1), HttpStatus.OK);
    }


    //  FIRST NAME ASC

    @RequestMapping(value = "candidates/sort_fnasc/",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity <List<Candidate>> getAllCandidatesDefaultFNASC() throws PageException {
        return new ResponseEntity<List<Candidate>>(candidateDAO.getAllCandidatesAcsByFirstName(1), HttpStatus.OK);
    }


    @RequestMapping(value = "candidates/sort_fnasc/{page}",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity <List<Candidate>> getAllCandidatesFNASC(@PathVariable Integer page) throws PageException {
        return new ResponseEntity<List<Candidate>>(candidateDAO.getAllCandidatesAcsByFirstName(page), HttpStatus.OK);
    }

    //  LAST NAME ASC

    @RequestMapping(value = "candidates/sort_lnasc/",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity <List<Candidate>> getAllCandidatesDefaultLNASC() throws PageException {
        return new ResponseEntity<List<Candidate>>(candidateDAO.getAllCandidatesAcsByLastName(1), HttpStatus.OK);
    }


    @RequestMapping(value = "candidates/sort_lnasc/{page}",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity <List<Candidate>> getAllCandidatesLNASC(@PathVariable Integer page) throws PageException {
        return new ResponseEntity<List<Candidate>>(candidateDAO.getAllCandidatesAcsByLastName(page), HttpStatus.OK);
    }

    // FIRST NAME DESC

    @RequestMapping(value = "candidates/sort_fndesc/",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity <List<Candidate>> getAllCandidatesDefaultFNDESC() throws PageException {
        return new ResponseEntity<List<Candidate>>(candidateDAO.getAllCandidatesDescByFirstName(1), HttpStatus.OK);
    }


    @RequestMapping(value = "candidates/sort_fndesc/{page}",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity <List<Candidate>> getAllCandidatesFNDESC(@PathVariable Integer page) throws PageException {
        return new ResponseEntity<List<Candidate>>(candidateDAO.getAllCandidatesDescByFirstName(page), HttpStatus.OK);
    }


    //  LAST NAME DESC

    @RequestMapping(value = "candidates/sort_lndesc/",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity <List<Candidate>> getAllCandidatesDefaultLNDESC() throws PageException {
        return new ResponseEntity<List<Candidate>>(candidateDAO.getAllCandidatesDescByLastName(1), HttpStatus.OK);
    }


    @RequestMapping(value = "candidates/sort_lndesc/{page}",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity <List<Candidate>> getAllCandidatesLNDESC(@PathVariable Integer page) throws PageException {
        return new ResponseEntity<List<Candidate>>(candidateDAO.getAllCandidatesDescByLastName(page), HttpStatus.OK);
    }





}
