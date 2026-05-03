package services;

import entities.Payment;
import enums.PaymentStatus;
import model.PaymentRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import repositories.PaymentRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Payment initiatePayment(PaymentRequestDto dto) {
        Payment payment = new Payment();

        payment.setPaymentReference("PAY-" + UUID.randomUUID());
        payment.setUserId(dto.getUserId());
        payment.setMerchantId(dto.getMerchantId());
        payment.setAmount(dto.getAmount());
        payment.setCurrency(dto.getCurrency());
        payment.setPaymentMethod(dto.getPaymentMethod());
        payment.setProvider(dto.getProvider());
        payment.setDescription(dto.getDescription());
        payment.setPaymentStatus(String.valueOf(PaymentStatus.PENDING));
        payment.setInitiatedAt(LocalDateTime.now());

        return paymentRepository.save(payment);
    }
    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public ResponseEntity<Payment> getPaymentByReference(String reference) {
        Payment pay=paymentRepository.findByPaymentReference(reference);
        return new ResponseEntity<>(pay, pay != null ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @Override
    public Payment updatePaymentStatus(String reference, PaymentStatus status) {
        Payment payment = getPaymentByReference(reference).getBody();
        assert payment != null;
        payment.setPaymentStatus(String.valueOf(status));
        return paymentRepository.save(payment);
    }
}
