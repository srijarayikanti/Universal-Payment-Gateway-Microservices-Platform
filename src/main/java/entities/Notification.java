package entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notification_id")
    private Long notificationId;

    @Column(name = "UserId")
    private Long userId;

    @Column(name = "type")
    private String type;
    // EMAIL, SMS, PUSH

    @Column(name = "Message")
    private String message;

    @Column(name = "status")
    private String status;
    // SENT, FAILED

    @Column(name = "SentAt")
    private LocalDateTime sentAt;
}
