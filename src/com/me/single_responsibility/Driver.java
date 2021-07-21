package com.me.single_responsibility;

public class Driver {

	private int mileage;
	
    // functionality
    public void drive(int milesDriven){
        this.setMileage(this.getMileage() + milesDriven);
    }

	@Override
	public String toString() {
		return "Driver [mileage=" + mileage + "]";
	}

	public Driver() {
		super();
	}

	public Driver(int mileage) {
		super();
		this.mileage = mileage;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
    
    
    
}
