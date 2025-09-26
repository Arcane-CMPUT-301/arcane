package com.example.arcane;

public abstract class Shape {
    private int x;
    private int y;
    private String color = "magenta";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
