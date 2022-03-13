package Entities;

import Enuns.Color;

public class Rectangle extends Shape{

    private Double width;
    private Double height;

    public Rectangle() {
    }

    public Rectangle(Color color, Double width,Double height) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return this.width * height;
    }
}
