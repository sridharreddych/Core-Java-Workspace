package com.sree.factory;

/* Use the Factory to get object of concrete class by passing an information such as type */
public class FactoryPatternDemo {
public static void main(String[] args) {
ShapeFactory shapeFactory = new ShapeFactory();
//get an object of Circle and call its draw m ethod.
Shape shape1 = shapeFactory.getShape("CIRCLE");
//call draw m ethod of Circle
shape1.draw();
//get an object of Rectangle and call its draw m ethod.
Shape shape2 = shapeFactory.getShape("RECTANGLE");
//call draw m ethod of Rectangle
shape2.draw();
//get an object of Square and call its draw m ethod.
Shape shape3 = shapeFactory.getShape("SQUARE");
//call draw m ethod of circle
shape3.draw();
}
}