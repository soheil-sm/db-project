package ir.ac.hut.dbproject.services;

import ir.ac.hut.dbproject.exception.EntityNotFoundException;
import ir.ac.hut.dbproject.exception.UserAlreadyExistsException;
import ir.ac.hut.dbproject.model.User;
import ir.ac.hut.dbproject.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User signup(User user) throws Exception {
        if (userRepository.findByUsername(user.getUsername()) != null) {
            throw new UserAlreadyExistsException(user.getUsername());
        }
        return userRepository.save(user);
    }

    public User login(User user) throws Exception {
        User user1 = userRepository.findByUsername(user.getUsername());
        if (user1 == null) {
            throw new EntityNotFoundException("User", "username", user.getUsername());
        }
        return user1;
    }
}
