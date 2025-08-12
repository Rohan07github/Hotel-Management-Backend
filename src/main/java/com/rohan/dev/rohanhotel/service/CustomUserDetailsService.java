package com.rohan.dev.rohanhotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rohan.dev.rohanhotel.exception.OurException;
import com.rohan.dev.rohanhotel.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
       return userRepository.findByEmail(username).orElseThrow(() -> new OurException("Username/Email not Found"));
    }


}