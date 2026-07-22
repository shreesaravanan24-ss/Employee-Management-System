package com.employee.service.impl;

import com.employee.model.Employee;
import com.employee.repository.impl.EmployeeRepositoryImpl;
import com.employee.repository.interfaces.EmployeeRepository;
import com.employee.service.interfaces.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl() {
        this.employeeRepository = new EmployeeRepositoryImpl();
    }

    @Override
    public boolean addEmployee(Employee employee) {

        if (employee == null) {
            return false;
        }

        if (employee.getEmployeeName() == null || employee.getEmployeeName().trim().isEmpty()) {
            return false;
        }

        if (employee.getSalary() < 0) {
            return false;
        }

        return employeeRepository.addEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        return employeeRepository.getEmployeeById(employeeId);
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        return employeeRepository.updateEmployee(employee);
    }

    @Override
    public boolean deleteEmployee(int employeeId) {
        return employeeRepository.deleteEmployee(employeeId);
    }
}