package com.example.springsecurity.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.springsecurity.Repositories.UserRepo;
import com.example.springsecurity.Modals.UserPrincipal;
import com.example.springsecurity.Modals.Users;

@Service
public class MyUserDetailService implements UserDetailsService{

    @Autowired
    private UserRepo userRepo;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepo.findByUsername(username);
        if(user == null){
            System.out.println("Not found");
            throw new UsernameNotFoundException("User not found");
        }

        return new UserPrincipal(user);
    }
    
}
 