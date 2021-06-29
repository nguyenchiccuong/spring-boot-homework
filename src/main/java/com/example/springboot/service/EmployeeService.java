package com.example.springboot.service;

import java.util.List;

import com.example.springboot.entity.Employee;

public interface EmployeeService {
    public List<Employee> retrieveEmployees();

    public Employee getEmployee(long employeeId);

    public Employee saveEmployee(Employee employee);

    public void deleteEmployee(long employeeId);

    public void updateEmployee(Employee employee);
}
