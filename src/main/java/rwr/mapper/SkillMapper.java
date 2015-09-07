package rwr.mapper;

import rwr.model.Skill;

import java.util.List;


public interface SkillMapper {


    List<Skill> getSkills(Integer candidateId);

    List<Skill> getTopSkills(Integer candidateId);

    List<Skill> getUniqueSkills();

    void updateSkill(Skill newSkill);

    void insertSkill(Skill skill);

    void removeSkill(Skill skill);

}
