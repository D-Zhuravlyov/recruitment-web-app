package rwr.model;


import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.*;
import java.util.Date;

public class Candidate {

    private int candidateId;

    @Min(value = 3, message = "Minimum age is 3.")
    private int age;

    @NotNull(message = "First name cannot be null.")
    @NotEmpty(message = "First name cannot be empty.")
    @NotBlank(message =  "First name cannot be blank.")
    private String firstName;

    @NotNull(message = "First name cannot be null.")
    @NotEmpty(message = "First name cannot be empty.")
    @NotBlank(message =  "First name cannot be blank.")
    private String lastName;

    private Date dateAdded;
    private Date interviewDate;


    private Skill skill;

    public Candidate() {
    }

    public Candidate(String firstName, String lastName, int age, Date dateAdded, Date interviewDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateAdded = dateAdded;
        this.interviewDate = interviewDate;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + candidateId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dateAdded=" + dateAdded +
                ", interviewDate=" + interviewDate +
                '}';
    }
}
