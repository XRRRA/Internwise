package com.example.accessingdatamysql;

import jakarta.persistence.*;

@Entity
@Table(name = "users", schema = "internwise")
public class User {
    @Id
    @Column(name = "UserID", nullable = false)
    private Integer id;

    @Column(name = "FName", length = 64)
    private String fName;

    @Column(name = "LName", length = 64)
    private String lName;

    @Column(name = "Email")
    private String email;

    @Column(name = "Password", length = 64)
    private String password;

    @Lob
    @Column(name = "Education")
    private String education;

    @Lob
    @Column(name = "Experience")
    private String experience;

    @Column(name = "Contacts", length = 24)
    private String contacts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

}