package com.technoelevate.pushnotificationfirebase.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PushNotificationResponse implements Serializable {

    private int status;
    private String message;
}
