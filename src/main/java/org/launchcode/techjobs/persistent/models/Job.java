package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{
    @ManyToOne
    private Employer employer;
    @NotNull
    @ManyToMany
    private   List<Skill> skills = new ArrayList<Skill>();
    //    Task 3
//    Comment Out original code
//    @Id
//    @GeneratedValue
//    private int id;
//
//    private String name;
//    private String employer;
//    private String skills;


    public Job() {
    }

    // Initialize the id and value fields.
    // Changed anEmployer from String ton Employer Class
    // Changed someSkills to List of Skill Class
    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.
    // Modified to use Employer Class and
    // arrayList Skills Class
    //
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    // getEmployer returns Employer Class
    public Employer getEmployer() {
        return employer;
    }

    // setEmployer accepts Employer Class
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    // getSkills returns arrayList Skills Class
    public Iterable<Skill> getSkills() {
        return skills;
    }

    // setSkills accepts arrayList Skills Class
    public void setSkills(List<Skill> skills) {this.skills = skills;
    }

}
