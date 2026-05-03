package entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "merchants")
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "merchant_id")
    private Long merchantId;

    @Column(name = "business_name", nullable = false)
    private String businessName;

    @Column(name = "contact_email", nullable = false, unique = true)
    private String contactEmail;

    @Column(name = "MerchantCode", nullable = false, unique = true)
    private String merchantCode;

    @Column(name = "upi_id", unique = true)
    private String upiId;

    @Column(name = "bank_account_number", unique = true)
    private String bankAccountNumber;

    @Column(name = "ifsc_code")
    private String ifscCode;

    @Column(name = "Verified")
    private Boolean verified;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
