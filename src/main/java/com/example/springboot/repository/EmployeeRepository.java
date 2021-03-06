package com.example.springboot.repository;

import java.util.Optional;

import com.example.springboot.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("FROM Employee emp WHERE emp.email = ?1")
    Optional<Employee> findEmployeeByEmail(String email);
}
