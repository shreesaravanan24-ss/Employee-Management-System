package com.employee.util.generator;

import java.util.Random;

public class IdGenerator {

    public static int generateEmployeeId() {

        return 1000 + new Random().nextInt(9000);

    }

}