package com.example.accessingdatamysql;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "program", schema = "internwise")
public class Program {
    @Id
    @Column(name = "ProgramID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserID")
    private User userID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CompanyID")
    private Company companyID;

    @Column(name = "Title", length = 64)
    private String title;

    @Lob
    @Column(name = "Description")
    private String description;

    @Column(name = "StartDate")
    private LocalDate startDate;

    @Column(name = "EdnDate")
    private LocalDate ednDate;

    @Lob
    @Column(name = "Duration")
    private String duration;

    @Column(name = "Location", length = 64)
    private String location;

    @Column(name = "Salary", precision = 10)
    private BigDecimal salary;

    @Column(name = "Deadline")
    private LocalDate deadline;

    @Column(name = "Nr_positions")
    private Byte nrPositions;

    @Lob
    @Column(name = "ReqKnowledge")
    private String reqKnowledge;

    @Column(name = "ReviewCount")
    private Integer reviewCount;

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

    public Company getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Company companyID) {
        this.companyID = companyID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEdnDate() {
        return ednDate;
    }

    public void setEdnDate(LocalDate ednDate) {
        this.ednDate = ednDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public Byte getNrPositions() {
        return nrPositions;
    }

    public void setNrPositions(Byte nrPositions) {
        this.nrPositions = nrPositions;
    }

    public String getReqKnowledge() {
        return reqKnowledge;
    }

    public void setReqKnowledge(String reqKnowledge) {
        this.reqKnowledge = reqKnowledge;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

}