package com.gmail.ryitlearning;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(double sideA) {
        this(sideA, 5.0);
    }

    public Rectangle() {
        this(4.0, 3.0);
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double area() {
        return getSideA() * getSideB();
    }

    public double perimeter() {
        if (isSquare()) {
            return getSideA() * 4;
        }
        return getSideA() * 2 + getSideB() * 2;
    }

    public boolean isSquare() {
        return getSideA() == getSideB();
    }

    public void replaceSides() {
        if (!isSquare()) {
            double temp = getSideA();
            setSideA(getSideB());
            setSideB(temp);
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
