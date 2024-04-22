package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> myList = new ArrayList<>();

        Circle c1 = new Circle(23);
        Triangle t1 = new Triangle(12, 11, 14);
        Rectangle r1 = new Rectangle(23, 22);

        myList.add(c1);
        myList.add(t1);
        myList.add(r1);

        for (Shape s: myList){
            System.out.println("Shape: "+s);
            System.out.printf("Area: %.2f\n", s.getArea());
            System.out.printf("Perimeter: %.2f\n",s.getPerimeter());
            System.out.println();
        }
    }
}
