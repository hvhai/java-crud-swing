package com.codehunter;

import java.util.List;

public class UserUseCase {
    private final IUserRepository userRepository;

    public UserUseCase(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(AddUserRequest userRequest) {
        return userRepository.addUser(userRequest);
    }

    public void removeUser(Integer id) {
        userRepository.deleteUser(id);
    }

    public User findUserById(Integer id) {
        return userRepository.getUserById(id);
    }

    public List<User> getAllUser() {
        return userRepository.getAllUser();
    }
}
