package com.example.case_study.service.impl;
import com.example.case_study.model.security.MyUserDetail;
import com.example.case_study.model.security.User;
import com.example.case_study.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MyUserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=iUserRepository.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("user name: " + username +"not found ");

        }
        return new MyUserDetail(user);
    }
}

