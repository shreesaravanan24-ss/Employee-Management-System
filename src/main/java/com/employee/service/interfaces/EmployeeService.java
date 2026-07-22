package com.employee.service.interfaces;

import com.employee.model.Employee;

import java.util.List;

public interface EmployeeService {

    boolean addEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(int employeeId);

    boolean updateEmployee(Employee employee);

    boolean deleteEmployee(int employeeId);

}