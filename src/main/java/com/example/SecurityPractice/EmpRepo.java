package com.example.SecurityPractice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

    Employee findByUsername(String username);
}
