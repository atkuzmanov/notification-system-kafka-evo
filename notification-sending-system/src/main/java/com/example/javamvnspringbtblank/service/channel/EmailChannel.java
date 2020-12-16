package com.example.javamvnspringbtblank.service.channel;

import com.example.javamvnspringbtblank.model.Notification;
import com.example.javamvnspringbtblank.model.NotificationChannelType;

public class EmailChannel implements Channel {

    @Override
    public void notify(Notification notification) {
        System.out.println(notification.getMsg());
    }

    @Override
    public boolean supports(NotificationChannelType channelType) {
        return NotificationChannelType.EMAIL == channelType;
    }
}
