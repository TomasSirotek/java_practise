package oop_basics.repository_pattern;

import java.util.List;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<Entity> getAllUsers(){
        return userRepository.read();
    }

}
