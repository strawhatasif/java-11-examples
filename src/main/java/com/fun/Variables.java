package com.fun;

import org.apache.commons.lang3.StringUtils;

public class Variables {

    public static void main(String[] args) {
        printVariables();
    }

    private static void printVariables() {
        //Java 8
        String greeting = "hello, this is what we all know.";
        int daysInWeek = 7;

        System.out.println(greeting);
        System.out.println(daysInWeek);

        var message = "the power of Java 11 (well, this was introduced in Java 10)";
        var daysInMonth = 30;

        System.out.println("Java 11: " + message);
        System.out.println("Java 11: " + daysInMonth);
    }
}
