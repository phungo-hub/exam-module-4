package com.codegym.repository;

import com.codegym.model.Branch;
import com.codegym.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Iterable<Employee> findAllByBranch(Branch branch);

    @Query(nativeQuery = true,
            value = "SELECT * FROM employees ORDER BY age")
    List<Employee> sortEmployeeListByAge();
}
