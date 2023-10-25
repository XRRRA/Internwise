//package com.example.service.impl;
//
//import com.example.entities.User;
//import com.example.repository.UserRepository;
//import com.example.security.CustomUserDetails;
//import com.example.service.UserDetailsService;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service("customUserDetailsService")
//public class UserDetailsServiceImpl implements UserDetailsService {
//    private final UserRepository userRepository;
//
//    public UserDetailsServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUserEmail(String userEmail) {
//        Optional<User> user = userRepository.findByEmail(userEmail);
//        if(user.isEmpty()) {
//            throw new UsernameNotFoundException("User not found with such email:" + userEmail);
//        }
//        return null;
//    }
//
//
//
//}
