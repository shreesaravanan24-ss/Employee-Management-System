package com.employee.util.validator;

public final class InputValidator {

    private InputValidator() {
    }

    public static boolean validateEmployeeName(String name) {

        return name != null
                && !name.trim().isEmpty();

    }

    public static boolean validateDepartment(String department) {

        return department != null
                && !department.trim().isEmpty();

    }

    public static boolean validateEmail(String email) {

        return EmailValidator.isValid(email);

    }

    public static boolean validatePhone(String phoneNumber) {

        return PhoneValidator.isValid(phoneNumber);

    }

    public static boolean validateSalary(double salary) {

        return SalaryValidator.isValid(salary);

    }

    public static boolean validateEmployeeId(int employeeId) {

        return employeeId > 0;

    }

}