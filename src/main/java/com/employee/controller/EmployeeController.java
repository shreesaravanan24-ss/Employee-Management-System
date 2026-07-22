package com.employee.controller;

import com.employee.model.Employee;
import com.employee.service.impl.EmployeeServiceImpl;
import com.employee.service.interfaces.EmployeeService;

import java.util.List;

public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController() {
        employeeService = new EmployeeServiceImpl();
    }

    public void addEmployee(Employee employee) {

        if (employeeService.addEmployee(employee)) {

            System.out.println("\nEmployee Added Successfully.");

        } else {

            System.out.println("\nFailed To Add Employee.");

        }

    }

    public void viewAllEmployees() {

        List<Employee> employees = employeeService.getAllEmployees();

        if (employees.isEmpty()) {

            System.out.println("\nNo Employees Found.");
            return;

        }

        System.out.println("\n========== Employee List ==========");

        for (Employee employee : employees) {

            System.out.println(employee);

        }

    }

    public void searchEmployee(int employeeId) {

        Employee employee = employeeService.getEmployeeById(employeeId);

        if (employee != null) {

            System.out.println(employee);

        } else {

            System.out.println("\nEmployee Not Found.");

        }

    }

    public void updateEmployee(Employee employee) {

        if (employeeService.updateEmployee(employee)) {

            System.out.println("\nEmployee Updated Successfully.");

        } else {

            System.out.println("\nUpdate Failed.");

        }

    }

    public void deleteEmployee(int employeeId) {

        if (employeeService.deleteEmployee(employeeId)) {

            System.out.println("\nEmployee Deleted Successfully.");

        } else {

            System.out.println("\nDelete Failed.");

        }

    }
}