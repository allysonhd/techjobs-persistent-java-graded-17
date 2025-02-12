package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Please enter a location")
    @Size(min = 1, max = 168, message = "Location names must be between 1 and 168 characters")
    private String location;

    public Employer() {
    }

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    public @NotNull(message = "Please enter a location") @Size(min = 1, max = 168, message = "Location names must be between 1 and 168 characters") String getLocation() {
        return location;
    }

    public void setLocation(@NotNull(message = "Please enter a location") @Size(min = 1, max = 168, message = "Location names must be between 1 and 168 characters") String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

}
