package entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PaymentId")
    private Long paymentId;

    @Column(name = "PaymentReference", unique = true, nullable = false)
    private String paymentReference;

    @Column(name = "UserId")
    private Long userId;

    @Column(name = "MerchantId")
    private Long merchantId;

    @Column(name = "Amount", precision = 10, scale = 2)
    private BigDecimal amount;

    @Column(name = "Currency", length = 3)
    private String currency;

    @Column(name = "PaymentMethod", length = 20)
    private String paymentMethod;
    // UPI, CARD, WALLET, NETBANKING

    @Column(name = "Provider", length = 20)
    private String provider;
    // RAZORPAY, STRIPE, PHONEPE

    @Column(name = "PaymentStatus", length = 20)
    private String paymentStatus;
    // PENDING, SUCCESS, FAILED, REFUNDED

    @Column(name = "TransactionId", length = 50)
    private String transactionId;

    @Column(name = "UPITransactionId", length = 50)
    private String upiTransactionId;

    @Column(name = "Description", length = 255)
    private String description;

    @Column(name = "InitiatedAt")
    private LocalDateTime initiatedAt;

    @Column(name = "CompletedAt")
    private LocalDateTime completedAt;
}
