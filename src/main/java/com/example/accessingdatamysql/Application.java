package com.example.accessingdatamysql;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "application", schema = "internwise")
public class Application {
    @Id
    @Column(name = "ApplicationID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserID")
    private User userID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProgramID")
    private Program programID;

    @Column(name = "ApplicationDate")
    private Instant applicationDate;

    @Column(name = "Status", length = 16)
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    public Program getProgramID() {
        return programID;
    }

    public void setProgramID(Program programID) {
        this.programID = programID;
    }

    public Instant getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Instant applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}