package com.fun;

public class Variables {

    /*
    Some notes:
        *Java 10 introduced a powerful feature where one no longer has to declare the type of variable.
        *HOWEVER, Java is still a statically typed language. Therefore, there are some limitations.
        *All variables must be initialized for type inference to work.
        *Variables using type inference can only be declared locally.
        *Global variables are not allowed to be declared with var EVEN IF they are initialized.
     */

    //if you uncomment the below, this will not compile.
    
    //var sampleGreeting = "Hello World";
    public static void main(String[] args) {
        printVariables();
    }

    private static void printVariables() {
        //Java 8
        String greeting = "hello, this is what we all know.";
        int daysInWeek = 7;

        System.out.println(greeting);
        System.out.println(daysInWeek);

        var message = "the power of Java 10! applies to Java 11, too";
        var daysInMonth = 30;

        System.out.println("Java 10+: " + message);
        System.out.println("Java 10+: " + daysInMonth);
    }
}
