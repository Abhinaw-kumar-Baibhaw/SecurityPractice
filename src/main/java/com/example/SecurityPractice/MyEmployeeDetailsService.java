package com.example.SecurityPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyEmployeeDetailsService implements UserDetailsService {

    @Autowired
   private EmpRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
              Employee employee= repo.findByUsername(username);
              if(employee==null){
                  throw new UsernameNotFoundException("404 Not Found");
              }
return new EmployeePrincipal(employee);
    }
}
