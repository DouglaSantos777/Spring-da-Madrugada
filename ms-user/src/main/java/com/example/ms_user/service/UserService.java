package com.example.ms_user.service;

import com.example.ms_user.entities.User;
import com.example.ms_user.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public User saveUser(User user){
        return userRepository.save(user);
    }



}
