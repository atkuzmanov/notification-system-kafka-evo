package com.example.javamvnspringbtblank;

import com.example.javamvnspringbtblank.model.BasicNotification;
import com.example.javamvnspringbtblank.model.Notification;

/**
 * A test utility class for encompassing all common test related logic.
 */
public class TestUtils {
    protected static Notification generateNotification() {
        return generateNotification("Test message 1.");
    }

    protected static Notification generateNotification(String testMsg) {
        Notification notification = new BasicNotification();
        notification.setMessage(testMsg);
        return notification;
    }
}
