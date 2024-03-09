package com.cydeo.SolidPrinciples.dependencyInversion.good;

public class XMLReader implements Reader {

    @Override
    public String getUsername() {
        return "<username>mikesmith</username>";
    }

}