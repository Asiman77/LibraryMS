package Service;

import Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Yeni istifadəçi əlavə et (Admin qeydiyyatı)
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // İstifadəçini adı ilə tap
    public User getUserByName(String name) {
        return userRepository.findByName(name);
    }
}
