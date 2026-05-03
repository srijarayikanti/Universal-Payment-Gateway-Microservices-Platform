package model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class userRequestDto {
    private Long userId;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String password;
    private String role; // CUSTOMER, ADMIN, MERCHANT
    private Boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
