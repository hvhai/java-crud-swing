package com.codehunter;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserRepository implements IUserRepository{
    private static List<User> userData= new ArrayList<>();
    private Integer nextId = 1;
    {
        addUser(new AddUserRequest("Jone", 23));
        addUser(new AddUserRequest("Anna", 18));
        addUser(new AddUserRequest("Alex", 30));
        addUser(new AddUserRequest("Shan", 43));
        addUser(new AddUserRequest("Daniel", 51));
    }

    @Override
    public User addUser(AddUserRequest userRequest) {
        userData.add(new User(nextId, userRequest.name(), userRequest.age()));
        nextId++;
        return userData.getLast();
    }

    @Override
    public void deleteUser(Integer id) {
        User useFound = getUserById(id);
        if (useFound !=null) {
            userData.remove(useFound);
        }
    }

    @Override
    public User getUserById(Integer id) {
        return userData.stream()
                .filter(user -> user.id() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> getAllUser() {
        return userData;
    }
}
