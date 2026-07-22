package com.employee.util.validator;

import java.util.regex.Pattern;

public final class EmailValidator {

    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    private EmailValidator() {
    }

    public static boolean isValid(String email) {

        return email != null
                && !email.trim().isEmpty()
                && Pattern.matches(EMAIL_REGEX, email);

    }
}