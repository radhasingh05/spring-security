package com.radha;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(username.equals("radha")) {
            return User.withDefaultPasswordEncoder()
                    .username("radha")
                    .password("pass")
                    .roles("USER")
                    .build();
        } else {
            return null;
        }
    }
}
