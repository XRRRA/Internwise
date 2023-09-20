package com.example.accessingdatamysql;

import jakarta.persistence.*;

@Entity
@Table(name = "company", schema = "internwise")
public class Company {
    @Id
    @Column(name = "CompanyID", nullable = false)
    private Integer id;

    @Column(name = "CompanyName", length = 64)
    private String companyName;

    @Column(name = "Industry", length = 64)
    private String industry;

    @Column(name = "Website", length = 64)
    private String website;

    @Lob
    @Column(name = "Description")
    private String description;

    @Column(name = "Contacts", length = 24)
    private String contacts;

    @Lob
    @Column(name = "Socials")
    private String socials;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getSocials() {
        return socials;
    }

    public void setSocials(String socials) {
        this.socials = socials;
    }

}