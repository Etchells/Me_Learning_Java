package com.me.inheritance2;

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
