package org.academiadecodigo.bootcamp.model;

import java.util.HashMap;

public class Advertisement {

    private HashMap<String, Individual> applicants;

    private String description;
    private Individual advertiser;

    public Advertisement(String description, Individual advertiser) {
        applicants = new HashMap<>();
        this.description = description;
        this.advertiser = advertiser;
    }

    public HashMap<String, Individual> getApplicants() {
        return applicants;
    }

    public void addApplicant(Individual applicant) {
        applicants.put(applicant.getUser().getEmail(),applicant);
    }

    public String getDescription() {
        return description;
    }

    public Individual getAdvertiser() {
        return advertiser;
    }
}
