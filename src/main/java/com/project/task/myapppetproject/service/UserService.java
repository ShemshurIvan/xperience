package com.project.task.myapppetproject.service;

import com.project.task.myapppetproject.dto.user.UserRequest;
import com.project.task.myapppetproject.dto.user.UserResponse;
import com.project.task.myapppetproject.entity.User;
import com.project.task.myapppetproject.exception.EmailAlreadyExistsException;
import com.project.task.myapppetproject.repository.UserRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public UserResponse createUser(UserRequest request) {
        String email = request.email().trim().toLowerCase();

        if (userRepository.existsByEmail(email)) {
            throw new EmailAlreadyExistsException(email);
        }

        User user = new User();
        user.setFirstName(request.firstName().trim());
        user.setLastName(request.lastName().trim());
        user.setEmail(email);
        user.setAge(request.age());
        user.setPassword(passwordEncoder.encode(request.password()));

        User saved;
        try {
            saved = userRepository.saveAndFlush(user);
        } catch (DataIntegrityViolationException e) {
            throw new EmailAlreadyExistsException(email);
        }

        return new UserResponse(
                saved.getId(),
                saved.getFirstName(),
                saved.getLastName(),
                saved.getEmail(),
                saved.getAge()
        );
    }
}