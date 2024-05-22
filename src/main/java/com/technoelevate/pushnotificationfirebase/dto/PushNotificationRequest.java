package com.technoelevate.pushnotificationfirebase.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PushNotificationRequest implements Serializable {

    private String title;
    private String message;
    private String topic;
    private String token;
}
