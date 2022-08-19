package com.authProject;

import com.authProject.models.MyUserDetails;
import com.authProject.models.User;
import com.authProject.models.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user= userRepository.findByUserName(userName);

        user.orElseThrow(()->new UsernameNotFoundException("Not Found"+userName));
        return user.map(MyUserDetails::new).get();
    }
}
