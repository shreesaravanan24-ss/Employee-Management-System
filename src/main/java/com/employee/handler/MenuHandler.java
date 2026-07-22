package com.employee.handler;

import com.employee.controller.EmployeeController;
import com.employee.controller.InputController;
import com.employee.controller.MenuController;
import com.employee.model.Employee;

public class MenuHandler {

    private final MenuController menuController;
    private final InputController inputController;
    private final EmployeeController employeeController;

    public MenuHandler() {
        menuController = new MenuController();
        inputController = new InputController();
        employeeController = new EmployeeController();
    }

    public void startMenu() {

        boolean running = true;

        while (running) {

            menuController.displayMainMenu();

            int choice = inputController.getChoice();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    viewAllEmployees();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    updateEmployee();
                    break;

                case 5:
                    deleteEmployee();
                    break;

                case 6:
                    running = false;
                    System.out.println("\nThank You For Using Employee Management System.");
                    break;

                default:
                    System.out.println("\nInvalid Choice. Please Try Again.");
            }
        }
    }

    private void addEmployee() {

        Employee employee = new Employee();

        employee.setEmployeeId(inputController.getEmployeeId());
        employee.setEmployeeName(inputController.getEmployeeName());
        employee.setDepartment(inputController.getDepartment());
        employee.setSalary(inputController.getSalary());
        employee.setEmail(inputController.getEmail());
        employee.setPhoneNumber(inputController.getPhoneNumber());

        employeeController.addEmployee(employee);
    }

    private void viewAllEmployees() {

        employeeController.viewAllEmployees();

    }

    private void searchEmployee() {

        int employeeId = inputController.getEmployeeId();

        employeeController.searchEmployee(employeeId);

    }

    private void updateEmployee() {

        Employee employee = new Employee();

        employee.setEmployeeId(inputController.getEmployeeId());
        employee.setEmployeeName(inputController.getEmployeeName());
        employee.setDepartment(inputController.getDepartment());
        employee.setSalary(inputController.getSalary());
        employee.setEmail(inputController.getEmail());
        employee.setPhoneNumber(inputController.getPhoneNumber());

        employeeController.updateEmployee(employee);

    }

    private void deleteEmployee() {

        int employeeId = inputController.getEmployeeId();

        employeeController.deleteEmployee(employeeId);

    }
}