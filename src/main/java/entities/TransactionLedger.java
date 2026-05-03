package entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "transaction_ledger")
public class TransactionLedger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ledger_id")
    private Long ledgerId;

    @Column(name = "payment_id")
    private Long paymentId;

    @Column(name = "DebitAccount")
    private String debitAccount;

    @Column(name = "CreditAccount")
    private String creditAccount;

    @Column(name = "Amount")
    private BigDecimal amount;

    @Column(name = "TransactionType")
    private String transactionType;
    // PAYMENT, REFUND, REVERSAL

    @Column(name = "TransactionDate")
    private LocalDateTime transactionDate;
}