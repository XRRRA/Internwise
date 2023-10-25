package com.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "company", schema = "new_version")
public class Company {
    @Id
    @Column(name = "company_id", nullable = false)
    private Integer id;

    @Column(name = "company_name", length = 64)
    private String companyName;

    @Column(name = "industry", length = 64)
    private String industry;

    @Column(name = "website", length = 64)
    private String website;

    @Lob
    @Column(name = "description")
    private String description;

    @Lob
    @Column(name = "contacts")
    private String contacts;

    @Lob
    @Column(name = "socials")
    private String socials;

    @Lob
    @Column(name = "company_url_path")
    private String companyUrlPath;

    @Lob
    @Column(name = "company_img_path")
    private String companyImgPath;

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

    public String getCompanyUrlPath() {
        return companyUrlPath;
    }

    public void setCompanyUrlPath(String companyUrlPath) {
        this.companyUrlPath = companyUrlPath;
    }

    public String getCompanyImgPath() {
        return companyImgPath;
    }

    public void setCompanyImgPath(String companyImgPath) {
        this.companyImgPath = companyImgPath;
    }

}