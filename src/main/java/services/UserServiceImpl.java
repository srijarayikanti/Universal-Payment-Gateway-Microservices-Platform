package services;


import entities.User;
import model.userRequestDto;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import repositories.userRepository;

public class UserServiceImpl implements UserService {
    private final userRepository userRepository;

    public UserServiceImpl(userRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public ResponseEntity<?> saveUserDetails(userRequestDto request) {
        // Implement the logic to save user details
        User user=new User();
        if(request.getUserId()==0){
            BeanUtils.copyProperties(request,user,"userId");
        }
        BeanUtils.copyProperties(request,user);
        userRepository.save(user);
        return ResponseEntity.ok("User details saved successfully");
    }
}
