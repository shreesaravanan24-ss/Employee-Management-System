package com.employee.repository.mapper;

import com.employee.model.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet resultSet) throws SQLException {

        Employee employee = new Employee();

        employee.setEmployeeId(resultSet.getInt("employee_id"));
        employee.setEmployeeName(resultSet.getString("employee_name"));
        employee.setDepartment(resultSet.getString("department"));
        employee.setSalary(resultSet.getDouble("salary"));
        employee.setEmail(resultSet.getString("email"));
        employee.setPhoneNumber(resultSet.getString("phone_number"));

        return employee;
    }
}