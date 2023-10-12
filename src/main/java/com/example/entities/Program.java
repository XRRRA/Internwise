package com.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "program", schema = "new_version")
public class Program {
    @Id
    @Column(name = "program_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @Lob
    @Column(name = "title")
    private String title;

    @Lob
    @Column(name = "description")
    private String description;

    @Lob
    @Column(name = "duration")
    private String duration;

    @Column(name = "location", length = 64)
    private String location;

    @Lob
    @Column(name = "knowledge_needed")
    private String knowledgeNeeded;

    @Lob
    @Column(name = "experience_needed")
    private String experienceNeeded;

    @Lob
    @Column(name = "salary")
    private String salary;

    @Lob
    @Column(name = "work_schedule")
    private String workSchedule;

    @Column(name = "deadline")
    private LocalDate deadline;

    @Lob
    @Column(name = "work_place")
    private String workPlace;

    @Column(name = "nr_positions")
    private Integer nrPositions;

    @Column(name = "review_count")
    private Integer reviewCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
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

    public String getKnowledgeNeeded() {
        return knowledgeNeeded;
    }

    public void setKnowledgeNeeded(String knowledgeNeeded) {
        this.knowledgeNeeded = knowledgeNeeded;
    }

    public String getExperienceNeeded() {
        return experienceNeeded;
    }

    public void setExperienceNeeded(String experienceNeeded) {
        this.experienceNeeded = experienceNeeded;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getWorkSchedule() {
        return workSchedule;
    }

    public void setWorkSchedule(String workSchedule) {
        this.workSchedule = workSchedule;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public Integer getNrPositions() {
        return nrPositions;
    }

    public void setNrPositions(Integer nrPositions) {
        this.nrPositions = nrPositions;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

}