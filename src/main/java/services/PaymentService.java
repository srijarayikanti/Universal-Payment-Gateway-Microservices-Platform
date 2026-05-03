package services;

import entities.Payment;
import enums.PaymentStatus;
import model.PaymentRequestDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PaymentService {
    Payment initiatePayment(PaymentRequestDto dto);

    List<Payment> getAllPayments();

    ResponseEntity<Payment> getPaymentByReference(String reference);

    Payment updatePaymentStatus(String reference, PaymentStatus status);
}
