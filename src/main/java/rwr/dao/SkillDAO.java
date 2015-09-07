package rwr.dao;

import rwr.exceptions.IdException;
import rwr.exceptions.SkillException;
import rwr.model.Skill;

import java.util.List;

public interface SkillDAO {

    List<Skill> getSkills(Integer candidateId) throws IdException;

    List<Skill> getTopSkills(Integer candidateId) throws IdException;

    List<Skill> getUniqueSkills();

    void updateSkill(Skill skill) throws SkillException;

    void insertSkill(Skill skill) throws SkillException;

    void removeSkill(Skill skill) throws SkillException;

}
