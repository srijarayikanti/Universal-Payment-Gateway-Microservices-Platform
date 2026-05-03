package model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class TransactionRequestDto {
    private Long ledgerId;
    private Long paymentId;
    private String debitAccount;
    private String creditAccount;
    private BigDecimal amount;
    private String transactionType;
    // PAYMENT, REFUND, REVERSAL
    private LocalDateTime transactionDate;

}
