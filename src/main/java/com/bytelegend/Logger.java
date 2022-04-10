package com.bytelegend;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Logger {
    public static void logAccessToSalaryOfPerson(String name) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        new Throwable().printStackTrace(pw);
        System.out.println(name + "'s salary is accessed: " + sw);
    }
}
