package com.codegym.service;

import com.codegym.model.Branch;
import com.codegym.model.Employee;
import com.codegym.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> sortEmployeeListByAge() {
        return employeeRepository.sortEmployeeListByAge();
    }

    @Override
    public void remove(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Iterable<Employee> findAllByBranch(Branch branch) {
        return employeeRepository.findAllByBranch(branch);
    }

}
