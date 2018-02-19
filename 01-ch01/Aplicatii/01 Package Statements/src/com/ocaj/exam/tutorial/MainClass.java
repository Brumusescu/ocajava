package com.ocaj.exam.tutorial; // package statement

/* Imports class ArrayList from the java.util package */
import java.util.ArrayList;
/* Imports all classes from the java.io package */
import java.io.*;

/**
 * Created by Diana on 2/4/2018.
 */
public class MainClass {
    public static void main(String[] args) {
        /* Creates console from java.io package - run outside your IDE */
        Console console = System.console();
        String planet = console.readLine(" \nEnter your favorite planet: ");
        /* Creates list of planets: */
        ArrayList planetList = new ArrayList();
        planetList.add(planet); // Adds users input to the list
        planetList.add("Gliese 581 c");
        System.out.println(" \nTwo cool planets: " + planetList);
    }
}
