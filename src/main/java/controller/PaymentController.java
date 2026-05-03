package controller;

import common.ErrorResponse;
import entities.Payment;
import enums.PaymentStatus;
import model.PaymentRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import java.util.List;

@RestController
public interface PaymentController {

    @Operation(
            summary="initiatePayment",
            operationId="initiatePayment",
            tags="Payment",
            responses = {
                    @ApiResponse(responseCode = "200",description = "saveCustomer saved successfully",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = Payment.class))),
                    @ApiResponse(responseCode = "401",description = "Error occurred",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = ErrorResponse.class)))

            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/Payment/initiatePayment",
            produces = "application/json",
            consumes = "application/json"
    )
    @CrossOrigin
    Payment initiatePayment(@RequestBody PaymentRequestDto dto);

    @Operation(
            summary="getPaymentStatus",
            operationId="getPaymentStatus",
            tags="Payment",
            responses = {
                    @ApiResponse(responseCode = "200",description = "saveCustomer saved successfully",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = Payment.class))),
                    @ApiResponse(responseCode = "401",description = "Error occurred",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = ErrorResponse.class)))

            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/Payment/getPaymentStatus",
            produces = "application/json"
    )
    @CrossOrigin
    List<Payment> getPaymentStatus();

    @Operation(
            summary="getPaymentByReference",
            operationId="getPaymentByReference",
            tags="Payment",
            responses = {
                    @ApiResponse(responseCode = "200",description = "saveCustomer saved successfully",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = Payment.class))),
                    @ApiResponse(responseCode = "401",description = "Error occurred",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = ErrorResponse.class)))

            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/Payment/getPaymentByReference",
            produces = "application/json"
    )
    @CrossOrigin
    ResponseEntity<Payment> getPaymentByReference(@RequestParam String reference);

    @Operation(
            summary="updatePaymentStatus",
            operationId="updatePaymentStatus",
            tags="Payment",
            responses = {
                    @ApiResponse(responseCode = "200",description = "saveCustomer saved successfully",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = Payment.class))),
                    @ApiResponse(responseCode = "401",description = "Error occurred",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = ErrorResponse.class)))

            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/Payment/updatePaymentStatus",
            produces = "application/json",
            consumes = "application/json"
    )
    @CrossOrigin
    Payment updatePaymentStatus(@RequestParam String reference,@RequestBody PaymentStatus status);
}
