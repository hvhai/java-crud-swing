package com.codehunter;

import java.util.List;

public interface IUserRepository {
    User addUser(AddUserRequest userRequest);
    void deleteUser(Integer id);
    User getUserById(Integer id);
    List<User> getAllUser();
}
