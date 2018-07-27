package com.sree.AbstractFactoryPattern;

public abstract class AbstractFactory {
	
	abstract Color getColor(String color);
	abstract Shape getShape(String shape) ;
}