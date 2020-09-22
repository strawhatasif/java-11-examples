package com.fun;

import java.util.Arrays;

public class Lines {

    public static void main(String[] args) {
        demonstrateStringLinesFunctionality();
    }

    private static void demonstrateStringLinesFunctionality() {
        String message = "Hello\nI\nam\nhappy\nto\nmeet\nyou";

        //Java 8
        Arrays.stream(message.split("\n")).forEach(line -> System.out.println(line));

        System.out.println("\n**************************\n");

        //Java 11 - lines method on String
        message.lines().forEach(line -> System.out.println(line));
    }
}
