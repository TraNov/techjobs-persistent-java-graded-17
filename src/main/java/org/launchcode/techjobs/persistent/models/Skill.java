package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    // Task 4
    // Map Skill Class ManyToMany to match Job Class
    // Add String Description field
    // Add arrayList Job Class
    private String description;
    @ManyToMany(mappedBy = "skills")
    public List<Job> jobs = new ArrayList<>();
    public Skill(){}

    // Accept Description and arrayLis of Job Class
    public Skill(String description, List<Job> jobs){
        this.description= description;
        this.jobs=jobs;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }


}
