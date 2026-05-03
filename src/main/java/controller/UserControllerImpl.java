package controller;

import model.userRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import services.UserService;

@RestController
public class UserControllerImpl implements UserController {
    private final UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<?> saveUserDetails(userRequestDto request) {
        try {
            // Implement the logic to save user details
            // For example, you can call a service method to handle the business logic
            // userService.saveUserDetails(request);
            return userService.saveUserDetails(request);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
