package model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class RefundRequestDto {
    private Long refundId;
    private Long paymentId;
    private BigDecimal refundAmount;
    private String refundReason;
    private String refundStatus;
    // INITIATED, SUCCESS, FAILED
    private LocalDateTime createdAt;
}
