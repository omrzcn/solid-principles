package com.cydeo.SolidPrinciples.dependencyInversion.bad;

public class XMLReader {

    public String getUsername() {
        return "<username>mikesmith</username>";
    }

}