package com.cydeo.SolidPrinciples.openClosed.example1.good;

public class Circle implements Shape {

    private double radius;

    @Override
    public void draw() {
        System.out.println("Drawing Circle.");
    }

}