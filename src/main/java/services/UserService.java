package services;

import model.userRequestDto;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<?> saveUserDetails(userRequestDto request);

    ResponseEntity<?> fetchUserDetailsByEmailId(String email);
}
