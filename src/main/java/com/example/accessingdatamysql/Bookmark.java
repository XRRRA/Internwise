package com.example.accessingdatamysql;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "bookmark")
public class Bookmark {
    @Id
    @Column(name = "bookmark_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "program_id")
    private Program program;

    @Column(name = "bookmark_date")
    private Instant bookmarkDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Instant getBookmarkDate() {
        return bookmarkDate;
    }

    public void setBookmarkDate(Instant bookmarkDate) {
        this.bookmarkDate = bookmarkDate;
    }

}