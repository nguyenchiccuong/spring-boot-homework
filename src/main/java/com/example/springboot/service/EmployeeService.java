package com.example.springboot.service;

import java.util.List;

import com.example.springboot.entity.Employee;

public interface EmployeeService {
    public List<Employee> retrieveEmployees();

    public Employee getEmployee(Long employeeId);

    public Employee saveEmployee(Employee employee);

    public void deleteEmployee(Long employeeId);

    public void updateEmployee(Long employeeId, Employee employee);
}
