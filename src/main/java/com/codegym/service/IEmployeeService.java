package com.codegym.service;

import com.codegym.model.Branch;
import com.codegym.model.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService extends IGeneralService<Employee> {
    Iterable<Employee> findAllByBranch(Branch branch);
    List<Employee> sortEmployeeListByAge();
}
