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
import rwr.dao.SkillDAO;
import rwr.exceptions.IdException;
import rwr.model.Skill;

import java.util.List;

@Controller
public class SkillsRESTController {

    @Autowired
    private SkillDAO skillDAO;

    @RequestMapping(value = "skills/{id}",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<List<Skill>> getAllSkills(@PathVariable Integer id) throws IdException {
        return new ResponseEntity<List<Skill>>(skillDAO.getSkills(id), HttpStatus.OK);
    }
}
