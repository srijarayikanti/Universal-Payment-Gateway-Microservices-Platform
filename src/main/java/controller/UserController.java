package controller;

import entities.Payment;
import entities.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import model.userRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;


public interface UserController {
    @Operation(
            summary="saveUserDetails",
            operationId="saveUserDetails",
            tags="User",
            responses = {
                    @ApiResponse(responseCode = "200",description = "saveCustomer saved successfully",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = User.class))),
                    @ApiResponse(responseCode = "401",description = "Error occurred",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = ErrorResponse.class)))

            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/User/saveUserDetails",
            produces = "application/json",
            consumes = "application/json"
    )
    @CrossOrigin
    ResponseEntity<?> saveUserDetails(@RequestBody userRequestDto request);

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
            method = RequestMethod.GET,
            value = "/User/fetchUserDetailsByEmailId",
            produces = "application/json"
    )
    @CrossOrigin
    ResponseEntity<?> fetchUserDetailsByEmailId(@RequestParam String email);
}
