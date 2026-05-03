package model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NotificationRequestDto {
    private Long notificationId;
    private Long userId;
    private String type;
    // EMAIL, SMS, PUSH
    private String message;
    private String status;
    // SENT, FAILED
    private LocalDateTime sentAt;

}
