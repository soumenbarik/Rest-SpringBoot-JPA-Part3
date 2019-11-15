package com.cts.academy.employee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.academy.employee.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,String>  {
    public Employee findByEmployeeId(String employeeId);    
}
