package com.employee.util.validator;

public final class PhoneValidator {

    private PhoneValidator() {
    }

    public static boolean isValid(String phoneNumber) {

        return phoneNumber != null
                && phoneNumber.matches("\\d{10}");

    }
}