package com.example.javamvnspringbtblank.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Simple POJO concrete implementation of the `Notification` interface and `NotificationBase` abstract class abstractions.
 * Includes annotations for mapping to database tables and fields.
 */
@Entity
@Table(name = "basicnotification")
public class BasicNotification extends NotificationBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long notificationId;

    private String message;

    public long getNotificationId() {
        return notificationId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BasicNotification() {
    }

    @Override
    @Column(name = "message")
    public String message() {
        return message;
    }

    @Override
    public String toString() {
        return "BasicNotification with notificationId: [" + notificationId + "] and message : [" + message + "].";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BasicNotification)) {
            return false;
        }
        BasicNotification basicNotification = (BasicNotification) o;
        return notificationId == basicNotification.notificationId &&
                Objects.equals(message, basicNotification.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationId, message);
    }
}
