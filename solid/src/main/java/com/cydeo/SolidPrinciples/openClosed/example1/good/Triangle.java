package com.cydeo.SolidPrinciples.openClosed.example1.good;

import java.awt.*;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}