package entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "refunds")
public class Refund {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "refund_id")
    private Long refundId;

    @Column(name = "payment_id")
    private Long paymentId;

    @Column(name = "refund_amount")
    private BigDecimal refundAmount;

    @Column(name = "refund_reason")
    private String refundReason;

    @Column(name = "refund_status")
    private String refundStatus;
    // INITIATED, SUCCESS, FAILED

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
