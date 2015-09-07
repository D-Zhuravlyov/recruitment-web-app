package rwr.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rwr.exceptions.IdException;
import rwr.exceptions.SkillException;
import rwr.mapper.SkillMapper;
import rwr.model.Skill;
import rwr.validator.DAOValidator;

import java.util.List;

@Transactional
@Service("SkillDAO")
public class SkillDAOImpl implements SkillDAO {

    @Autowired
    private SkillMapper skillMapper;

    @Autowired
    DAOValidator daoValidator;

    private static final Logger logger = LogManager.getLogger("SkillDAO");

    public List<Skill> getSkills(Integer candidateId) throws IdException {
        daoValidator.idValidate(candidateId);
        logger.debug("Returning list of skills of candidate: %s.", candidateId);
        return skillMapper.getSkills(candidateId);
    }

    public List<Skill> getTopSkills(Integer candidateId) throws IdException {
        daoValidator.idValidate(candidateId);
        logger.debug("Returning list of TOP-skills of candidate: %s.", candidateId);
        return skillMapper.getTopSkills(candidateId);
    }

    public List<Skill> getUniqueSkills() {
        logger.debug("Returning list of unique skills.");
        return skillMapper.getUniqueSkills();
    }

    public void updateSkill(Skill skill) throws SkillException {
        daoValidator.skillValidate(skill);
        logger.debug("Updating skill with id: %s.", skill.getSkillId());
        skillMapper.updateSkill(skill);
    }

    public void insertSkill(Skill skill) throws SkillException {
        daoValidator.skillValidate(skill);
        logger.debug("Inserting skill with id: %s.", skill.getSkillId());
        skillMapper.insertSkill(skill);
    }

    public void removeSkill(Skill skill) throws SkillException {
        daoValidator.skillValidate(skill);
        logger.debug("Removing skill of candidate: %s.", skill.getSkillId());
        skillMapper.removeSkill(skill);
    }
}
