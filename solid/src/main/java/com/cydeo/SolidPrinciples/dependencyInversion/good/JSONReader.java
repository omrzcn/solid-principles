package com.cydeo.SolidPrinciples.dependencyInversion.good;

public class JSONReader implements Reader {

    /*

        Example JSON:

        {
            "username": "mikesmith"
        }

     */

    @Override
    public String getUsername() {
        return "{\"username\": \"mikesmith\"}";
    }
}