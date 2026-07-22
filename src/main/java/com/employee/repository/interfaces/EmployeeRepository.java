package com.employee.repository.interfaces;

import com.employee.model.Employee;

import java.util.List;

public interface EmployeeRepository {

    boolean addEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(int employeeId);

    boolean updateEmployee(Employee employee);

    boolean deleteEmployee(int employeeId);

}