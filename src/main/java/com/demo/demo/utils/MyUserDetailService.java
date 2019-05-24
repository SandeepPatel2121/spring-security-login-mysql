/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.demo.utils;

import com.demo.demo.daos.UserDao;
import com.demo.demo.entitys.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 *
 * @author ABC
 */
@Component
public class MyUserDetailService implements UserDetailsService {
    
    @Autowired
    private UserDao userDao;
    
    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        User user = userDao.findByUsername(string);
        if (user == null ) {
            throw new UsernameNotFoundException("User Not Found");
        }
        return new UserPrincipal(user);
    }
    
}
