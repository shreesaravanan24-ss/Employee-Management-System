package com.employee.util.formatter;

public class ConsoleFormatter {

    public static void printHeader(String title) {

        System.out.println("\n==============================================");
        System.out.println("        " + title);
        System.out.println("==============================================");

    }

    public static void printSuccess(String message) {

        System.out.println("[SUCCESS] " + message);

    }

    public static void printError(String message) {

        System.out.println("[ERROR] " + message);

    }

}