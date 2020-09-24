package com.fun;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileFun {

    public static void main(String[] args) throws IOException {
        //Java 11 introduced improvements to read and write strings to/from a file.

        //Writing a string
        Path path = Files.writeString(Files.createTempFile("sample", ".txt"), "Look ma! I'm a writer!");

        //Reading contents from sample.txt
        System.out.println(Files.readString(path));
    }
}
