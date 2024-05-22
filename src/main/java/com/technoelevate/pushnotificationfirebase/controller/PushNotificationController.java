package com.technoelevate.pushnotificationfirebase.controller;

import com.technoelevate.pushnotificationfirebase.dto.PushNotificationRequest;
import com.technoelevate.pushnotificationfirebase.service.PushNotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class PushNotificationController {

    private final PushNotificationService pushNotificationService;

    @PostMapping("/send-notification")
    public ResponseEntity<String> sendNotification(@RequestBody PushNotificationRequest request) {
        return ResponseEntity.ok(pushNotificationService.sendPushNotificationToToken(request));
    }
}
