package com.employee.util.validator;

public final class SalaryValidator {

    private SalaryValidator() {
    }

    public static boolean isValid(double salary) {

        return salary > 0;

    }
}