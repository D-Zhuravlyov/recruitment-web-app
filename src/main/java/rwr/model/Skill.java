package rwr.model;


import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Skill {

    @NotNull(message = "Skill name cannot be null.")
    @NotEmpty(message = "Skill name cannot be empty.")
    @NotBlank(message =  "Skill name cannot be blank.")
    private String skillName;

    @NotNull(message = "Skill rate cannot be null.")
    @Min(value = 1, message = "Minimum skill rate value is 1.")
    @Max(value = 10, message = "Maximum skill rate value is 10.")
    private int skillRate;

    private int skillId;

    public Skill() {
    }

    public Skill(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public int getSkillRate() {
        return skillRate;
    }

    public void setSkillRate(int skillRate) {
        this.skillRate = skillRate;
    }


    public int getSkillId() {
        return skillId;
    }

    @Override
    public String toString() {
        return "Skill{" +
                ", skillName='" + skillName + '\'' +
                ", skillRate=" + skillRate +
                '}';
    }
}
