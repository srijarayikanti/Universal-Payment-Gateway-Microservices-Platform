package model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PaymentRequestDto {
    private Long paymentId;
    private String paymentReference;
    private Long userId;
    private Long merchantId;
    private BigDecimal amount;
    private String currency;
    private String paymentMethod;
    // UPI, CARD, WALLET, NETBANKING
    private String provider;
    // RAZORPAY, STRIPE, PHONEPE
    private String paymentStatus;
    // PENDING, SUCCESS, FAILED, REFUNDED
    private String transactionId;
    private String upiTransactionId;
    private String description;
    private LocalDateTime initiatedAt;
    private LocalDateTime completedAt;

}
