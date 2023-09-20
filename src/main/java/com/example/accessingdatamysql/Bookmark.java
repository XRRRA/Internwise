package com.example.accessingdatamysql;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "bookmark", schema = "internwise")
public class Bookmark {
    @Id
    @Column(name = "BookmarkID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserID")
    private User userID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProgramID")
    private Program programID;

    @Column(name = "BookmarkDate")
    private Instant bookmarkDate;

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

    public Instant getBookmarkDate() {
        return bookmarkDate;
    }

    public void setBookmarkDate(Instant bookmarkDate) {
        this.bookmarkDate = bookmarkDate;
    }

}