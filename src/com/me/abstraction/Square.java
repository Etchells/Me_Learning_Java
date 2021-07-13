package com.me.abstraction;

public class Square extends Shape{

	@Override
    public double getArea(double side){
        return side * side;
    }

    @Override
    public double getPerimeter(double size){
        return size * 4;
    }

    public String getColour(){
        return "blue";
    }
	
}


//Where is Square getting its methods from?
//
//getArea() is inherited from Shape and is overridden
//getPerimeter() is inherited from Shape is is overridden
//getColour() is functionality specific only to Square and isn't inherited from anywhere.