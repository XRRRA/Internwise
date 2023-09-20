package com.example.accessingdatamysql;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "review", schema = "internwise")
public class Review {
    @Id
    @Column(name = "ReviewID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserID")
    private User userID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProgramID")
    private Program programID;

    @Column(name = "Rating_stars")
    private Byte ratingStars;

    @Lob
    @Column(name = "Review_text")
    private String reviewText;

    @Column(name = "Review_date")
    private LocalDate reviewDate;

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

    public Byte getRatingStars() {
        return ratingStars;
    }

    public void setRatingStars(Byte ratingStars) {
        this.ratingStars = ratingStars;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }

}