package com.example.accessingdatamysql;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "notification", schema = "internwise")
public class Notification {
    @Id
    @Column(name = "NotificationID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserID")
    private User userID;

    @Lob
    @Column(name = "Notification_content")
    private String notificationContent;

    @Column(name = "Timestamp")
    private Instant timestamp;

    @Column(name = "Status", length = 8)
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

    public String getNotificationContent() {
        return notificationContent;
    }

    public void setNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}