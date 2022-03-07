package com.javaproject.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.javaproject.springboot.design.User;
import com.javaproject.springboot.repository.UserRepository;

public class UserRecordImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getUserByUsername(username);
        
        if (user == null) {
            throw new UsernameNotFoundException("User Not Found");
        }
        
        return new UserRecordService(user);
    }
}
