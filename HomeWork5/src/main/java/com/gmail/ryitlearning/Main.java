package com.gmail.ryitlearning;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(1);
        Rectangle square = new Rectangle(5, 5);
        Rectangle notSquare = new Rectangle(10, 5);

//        System.out.println(rectangle1.toString()); // expected: Rectangle{sideA=4.0, sideB=-3.0}
//        System.out.println(rectangle2.toString()); // expected: Rectangle{sideA=1.0, sideB=5.0}
//        System.out.println(square.toString());     // expected: Rectangle{sideA=5.0, sideB=5.0}
//        System.out.println(notSquare.toString());  // expected: Rectangle{sideA=10.0, sideB=5.0}
//        System.out.println("--------------------------------------------");
//        System.out.println(square.isSquare());     // expected: true
//        System.out.println(notSquare.isSquare());  // expected: false
//        System.out.println("--------------------------------------------");
//        System.out.println(rectangle1.area());     // expected: -12.0
//        System.out.println(rectangle1.perimeter()); // expected: 2.0
//        System.out.println("--------------------------------------------");
//        System.out.println(rectangle2.area());     // expected: 5.0
//        System.out.println(rectangle2.perimeter()); // expected: 12.0
//        System.out.println("--------------------------------------------");
//        System.out.println(square.area());     // expected: 25.0
//        System.out.println(square.perimeter()); // expected: 20.0
//        System.out.println("--------------------------------------------");
//        System.out.println(notSquare.area());     // expected: 50.0
//        System.out.println(notSquare.perimeter()); // expected: 30.0
//        System.out.println("--------------------------------------------");
//        rectangle1.replaceSides();
//        System.out.println(rectangle1); // expected: Rectangle{sideA=-3.0, sideB=4.0}
//        System.out.println("--------------------------------------------");
//        rectangle2.replaceSides();
//        System.out.println(rectangle2); // expected: Rectangle{sideA=5.0, sideB=1.0}
//        System.out.println("--------------------------------------------");
//        square.replaceSides();
//        System.out.println(square); // expected: Rectangle{sideA=5.0, sideB=5.0}
//        System.out.println("--------------------------------------------");
//        notSquare.replaceSides();
//        System.out.println(notSquare); // expected: Rectangle{sideA=5.0, sideB=10.0}
//
//
//        System.out.println()

        ArrayRectangles arrayRectangles1 = new ArrayRectangles(2);
//        System.out.println(arrayRectangles1.toString());
//        System.out.println(arrayRectangles1.addRectangle(rectangle1));
//        System.out.println(arrayRectangles1.addRectangle(rectangle2));
//        System.out.println(arrayRectangles1.addRectangle(square));
//        System.out.println(arrayRectangles1.toString());

//        System.out.println(arrayRectangles1.numberSquare());

        ArrayRectangles arrayRectangles2 = new ArrayRectangles(new Rectangle(10, 10), new Rectangle(5, 5), new Rectangle(6, 6), new Rectangle(7, 7));
        //new Rectangle(10, 10),
        System.out.println(arrayRectangles2.toString());
//        System.out.println(arrayRectangles2.numberSquare());

//        System.out.println(arrayRectangles2.findMaxArea());
//        System.out.println(arrayRectangles2.findMinPerimeter());
//
//
//        System.out.println(arrayRectangles2.numberMaxArea());
//        System.out.println(arrayRectangles2.numberMinPerimeter());

        System.out.println(arrayRectangles2.addRectangle(rectangle1));
        System.out.println(arrayRectangles2.toString());
        System.out.println("========================================");
        ArrayRectangles arrayRectangles3 = new ArrayRectangles(2);
        System.out.println(arrayRectangles3.toString());
        System.out.println(arrayRectangles3.addRectangle(rectangle2));
        System.out.println(arrayRectangles3.toString());
        System.out.println(arrayRectangles3.addRectangle(null));
        System.out.println(arrayRectangles3.toString());
        System.out.println(arrayRectangles3.addRectangle(rectangle2));
        System.out.println(arrayRectangles3.toString());

//        Rectangle[] rectangles = {new Rectangle(5, 5), new Rectangle(10, 6), new Rectangle(10, 20), null};
////       new ArrayRectangles(rectangles).addRectangle(new Rectangle(5,6));
//
//        System.out.println(new ArrayRectangles(rectangles).addRectangle(new Rectangle(5,6)));



    }

}
