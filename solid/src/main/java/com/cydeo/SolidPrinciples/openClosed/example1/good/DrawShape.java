package com.cydeo.SolidPrinciples.openClosed.example1.good;

public class DrawShape {

    public void startDrawing(List<Shape> shapes) {

        for (Shape shape: shapes) {
            shape.draw();
        }

    }

}