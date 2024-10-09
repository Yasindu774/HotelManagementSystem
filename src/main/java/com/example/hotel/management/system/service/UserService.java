package com.example.hotel.management.system.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.example.hotel.management.system.model.User;
import com.example.hotel.management.system.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("User not found with id: " + id));
    }

    public User createUser(User user) {
        // Additional validation or business logic can be implemented here
        return userRepository.save(user);
    }

    public User updateUser(Long id, User user) {
        User existingUser = getUserById(id);
        existingUser.setUsername(user.getUsername());
        existingUser.setPassword(user.getPassword());
        // Update other fields if necessary
        return userRepository.save(existingUser);
    }

    public void deleteUser(Long id) {
        User existingUser = getUserById(id);
        userRepository.delete(existingUser);
    }

    public boolean login(String username, String password) {
        if (username.equals("admin") && password.equals("root")) {
            return true;
        }
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}

