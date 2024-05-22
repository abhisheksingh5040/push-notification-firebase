package com.technoelevate.pushnotificationfirebase.service;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import com.technoelevate.pushnotificationfirebase.dto.PushNotificationRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PushNotificationService {

    private final FCMService fcmService;

    public String sendPushNotification(String token, String title, String body) throws FirebaseMessagingException {
        Message message = Message.builder()
                .setToken(token)
                .setNotification(Notification.builder().setTitle(title).setBody(body).build())
                .build();
        FirebaseMessaging.getInstance().send(message);

        return "notification send successfully!!!!";
    }

    public String sendPushNotificationToToken(PushNotificationRequest request) {
        try {
            fcmService.sendMessageToToken(request);
            return "notification send successfully!!!!";
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return null;
    }
}
