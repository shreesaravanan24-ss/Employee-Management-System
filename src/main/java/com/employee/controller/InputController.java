package com.employee.controller;

import java.util.Scanner;

public class InputController {

    private final Scanner scanner = new Scanner(System.in);

    public int getChoice() {
        return scanner.nextInt();
    }

    public int getEmployeeId() {

        System.out.print("Enter Employee ID : ");
        return scanner.nextInt();

    }

    public String getEmployeeName() {

        scanner.nextLine();

        System.out.print("Enter Employee Name : ");
        return scanner.nextLine();

    }

    public String getDepartment() {

        System.out.print("Enter Department : ");
        return scanner.nextLine();

    }

    public double getSalary() {

        System.out.print("Enter Salary : ");
        return scanner.nextDouble();

    }

    public String getEmail() {

        scanner.nextLine();

        System.out.print("Enter Email : ");
        return scanner.nextLine();

    }

    public String getPhoneNumber() {

        System.out.print("Enter Phone Number : ");
        return scanner.nextLine();

    }
}