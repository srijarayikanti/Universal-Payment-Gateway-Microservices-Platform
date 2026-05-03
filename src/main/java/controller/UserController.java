package controller;

import model.userRequestDto;
import org.springframework.http.ResponseEntity;


public interface UserController {
    ResponseEntity<?> saveUserDetails(userRequestDto request);
}
