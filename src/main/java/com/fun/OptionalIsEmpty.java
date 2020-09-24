package com.fun;

import java.util.Optional;

public class OptionalIsEmpty {

    public static void main(String[] args) {
        Optional<String> employeeName = getEmployeeName(false);
        Optional<String> supervisorName = getEmployeeName(true);

        //Java 8
        if (employeeName.isPresent()) {
            System.out.println("we have a name! " + employeeName.get());
        }

        //Java 11 - you can now use isEmpty instead of isPresent!
        if (supervisorName.isEmpty()) {
            System.out.println("whoops! no name!");
        }
    }

    private static Optional<String> getEmployeeName(boolean supervisor) {
        if (supervisor) {
           return Optional.empty();
        }
        else {
           return Optional.of("Jessica Harper");
        }
    }
}
