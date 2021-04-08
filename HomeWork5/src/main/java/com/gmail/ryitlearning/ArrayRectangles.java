package com.gmail.ryitlearning;

import java.util.Arrays;

public class ArrayRectangles {
    private final Rectangle[] rectangleArray;

    public ArrayRectangles(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        this.rectangleArray = new Rectangle[n];
    }

    public ArrayRectangles(Rectangle... rectangles) {
        if (rectangles == null) {
            throw new IllegalArgumentException();
        }
        this.rectangleArray = rectangles;
    }

    public boolean addRectangle(Rectangle rectangle) {
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] == null) {
                rectangleArray[i] = rectangle;
                return true;
            }
        }
        return false;
    }

    public int numberMaxArea() {
        double maxArea = findMaxArea();
        int index = 0;
        for (int i = 0; i <= rectangleArray.length - 1; i++) {
            if (rectangleArray[i].area() == maxArea) {
                return i;
            }
            index = i;
        }
        return index;
    }

    public int numberMinPerimeter() {
        double minPerimeter = findMinPerimeter();
        int index = 0;
        for (int i = 0; i <= rectangleArray.length - 1; i++) {
            if (rectangleArray[i].perimeter() == minPerimeter) {
                return i;
            }
            index = i;
        }
        return index;
    }

    public int numberSquares() {
        int result = 0;
        for (Rectangle rectangle : rectangleArray) {
            if (rectangle.isSquare()) {
                result++;
            }
        }
        return result;
    }

    public double findMaxArea() {
        double maxArea = 0;
        for (Rectangle rectangle : rectangleArray) {
            if (rectangle.area() > maxArea) {
                maxArea = rectangle.area();
            }
        }
        return maxArea;
    }

    public double findMinPerimeter() {
        double minPerimeter = rectangleArray[0].perimeter();
        for (Rectangle rectangle : rectangleArray) {
            if (rectangle.perimeter() <= minPerimeter) {
                minPerimeter = rectangle.perimeter();
            }
        }
        return minPerimeter;
    }

    @Override
    public String toString() {
        return "ArrayRectangles{" +
                "rectangleArray=" + Arrays.toString(rectangleArray) +
                '}';
    }
}
