package com.example.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import com.example.springboot.entity.Employee;
import com.example.springboot.exception.EmployeeEmailExistException;
import com.example.springboot.exception.EmployeeIdNotFoundException;
import com.example.springboot.repository.EmployeeRepository;
import com.example.springboot.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> retrieveEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Long employeeId) {
        return employeeRepository.findById(employeeId).orElseThrow(() -> new EmployeeIdNotFoundException(employeeId));
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        Optional<Employee> employeeByEmail = employeeRepository.findEmployeeByEmail(employee.getEmail());
        if (employeeByEmail.isPresent()) {
            throw new EmployeeEmailExistException(employee.getEmail());
        } else {
            return employeeRepository.save(employee);
        }
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        boolean exist = employeeRepository.existsById(employeeId);
        if (exist) {
            employeeRepository.deleteById(employeeId);
        } else {
            throw new EmployeeIdNotFoundException(employeeId);
        }
    }

    @Override
    public void updateEmployee(Long employeeId, Employee employee) {
        employeeRepository.findById(employeeId).map(oldEmployee -> {
            oldEmployee.setName(employee.getName());
            oldEmployee.setDob(employee.getDob());
            return employeeRepository.save(oldEmployee);
        }).orElseThrow(() -> new EmployeeIdNotFoundException(employeeId));
    }

}
