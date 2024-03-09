package com.cydeo.SolidPrinciples.dependencyInversion.good;

public class MyApp {

    public static void read(Reader reader) {

        UserReader userReader = new UserReader(reader);

        userReader.getUsername();

    }

}