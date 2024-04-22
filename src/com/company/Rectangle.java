package com.company;

// Represents rectangle shapes.
public class Rectangle implements Shape{
 public double width;
 public double height;

 public Rectangle(double width, double height){
     this.width = width;
     this.height = height;
 }

 public double getArea(){
     return width * height;
 }
 public double getPerimeter(){
     return 2.0 * (width + height);
 }
 public String toString(){
     return "Rectangle";
 }


}

