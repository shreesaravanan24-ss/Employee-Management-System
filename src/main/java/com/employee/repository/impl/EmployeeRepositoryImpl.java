package com.employee.repository.impl;

import com.employee.config.DatabaseConfig;
import com.employee.model.Employee;
import com.employee.repository.interfaces.EmployeeRepository;
import com.employee.repository.mapper.EmployeeRowMapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();

    @Override
    public boolean addEmployee(Employee employee) {

        String sql = """
                INSERT INTO employee
                (employee_id, employee_name, department, salary, email, phone_number)
                VALUES (?, ?, ?, ?, ?, ?)
                """;

        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, employee.getEmployeeId());
            statement.setString(2, employee.getEmployeeName());
            statement.setString(3, employee.getDepartment());
            statement.setDouble(4, employee.getSalary());
            statement.setString(5, employee.getEmail());
            statement.setString(6, employee.getPhoneNumber());

            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        return null;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        return false;
    }

    @Override
    public boolean deleteEmployee(int employeeId) {
        return false;
    }
}