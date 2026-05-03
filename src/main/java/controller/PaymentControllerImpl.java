package controller;

import entities.Payment;
import enums.PaymentStatus;
import model.PaymentRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import services.PaymentService;

import java.util.List;

@RestController
public class PaymentControllerImpl implements PaymentController{
    private final PaymentService paymentService;

    public PaymentControllerImpl(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public Payment initiatePayment(PaymentRequestDto dto) {
        return paymentService.initiatePayment(dto);
    }

    @Override
    public List<Payment> getPaymentStatus() {
        return paymentService.getAllPayments();
    }

    @Override
    public ResponseEntity<Payment> getPaymentByReference(String reference) {
        return paymentService.getPaymentByReference(reference);
    }

    @Override
    public Payment updatePaymentStatus(String reference, PaymentStatus status) {
        return paymentService.updatePaymentStatus(reference, status);
    }
}
