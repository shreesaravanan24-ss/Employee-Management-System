package com.employee.app;

import com.employee.handler.MenuHandler;

public class Application {

    private final MenuHandler menuHandler;

    public Application() {

        menuHandler = new MenuHandler();

    }

    public void start() {

        System.out.println("========================================");
        System.out.println("     Employee Management System");
        System.out.println("========================================");

        menuHandler.startMenu();

    }
}