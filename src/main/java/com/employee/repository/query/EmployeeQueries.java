package com.employee.repository.query;

public final class EmployeeQueries {

    // Private constructor to prevent object creation
    private EmployeeQueries() {
    }

    // =========================
    // INSERT QUERY
    // =========================
    public static final String INSERT_EMPLOYEE = """
            INSERT INTO employee
            (employee_id, employee_name, department, salary, email, phone_number)
            VALUES (?, ?, ?, ?, ?, ?)
            """;

    // =========================
    // SELECT QUERIES
    // =========================
    public static final String GET_ALL_EMPLOYEES = """
            SELECT *
            FROM employee
            ORDER BY employee_id
            """;

    public static final String GET_EMPLOYEE_BY_ID = """
            SELECT *
            FROM employee
            WHERE employee_id = ?
            """;

    // =========================
    // UPDATE QUERY
    // =========================
    public static final String UPDATE_EMPLOYEE = """
            UPDATE employee
            SET employee_name = ?,
                department = ?,
                salary = ?,
                email = ?,
                phone_number = ?
            WHERE employee_id = ?
            """;

    // =========================
    // DELETE QUERY
    // =========================
    public static final String DELETE_EMPLOYEE = """
            DELETE FROM employee
            WHERE employee_id = ?
            """;

    // =========================
    // VALIDATION QUERIES
    // =========================
    public static final String CHECK_EMAIL_EXISTS = """
            SELECT COUNT(*)
            FROM employee
            WHERE email = ?
            """;

    public static final String CHECK_PHONE_EXISTS = """
            SELECT COUNT(*)
            FROM employee
            WHERE phone_number = ?
            """;

    public static final String CHECK_EMPLOYEE_EXISTS = """
            SELECT COUNT(*)
            FROM employee
            WHERE employee_id = ?
            """;
}