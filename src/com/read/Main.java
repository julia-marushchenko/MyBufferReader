// Java program to read from console using BufferReader
package com.read;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Main class
public class Main {

    // Method main to run java program
    public static void main(String[] args) throws IOException {

        // Creating BufferReader entity
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));

        // Reading line from console
        String text = bufReader.readLine();

        // Printing text to console
        System.out.println(text);
    }
}