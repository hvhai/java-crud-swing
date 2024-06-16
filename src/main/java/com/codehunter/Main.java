package com.codehunter;

public class Main {
    public static void main(String[] args) {
        IUserRepository inMemoryUserRepository = new InMemoryUserRepository();
        new CrudApp(new UserUseCase(inMemoryUserRepository));
        System.out.println("App started!");
    }
}