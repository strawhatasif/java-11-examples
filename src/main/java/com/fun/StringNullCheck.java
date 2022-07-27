package com.fun;

import org.apache.commons.lang3.StringUtils;

public class StringNullCheck {

    public static void main(String[] args) {
        checkForNullValuesInAString();
    }

    private static void checkForNullValuesInAString() {
        //Java 10 - Local Variable Type Inference
        var country = "";
        var role = "Developer";

        //Java 8
        if (StringUtils.isBlank(country)) System.out.println("StringUtils from Apache Commons says the value is blank");
        if (StringUtils.isNotBlank(role)) System.out.println("StringUtils says we have a value!");

        //Java 11
        String random = null;
        if (random.isBlank()) System.out.println("hello");
        if (country.isBlank()) System.out.println("Java 11 says the value is blank!");
        if (!role.isBlank()) System.out.println("Java 11 says we have a value."); //NOTE: compared to StringUtils, no isNotBlank

    }
}
