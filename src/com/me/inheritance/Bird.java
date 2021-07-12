package com.me.inheritance;

public class Bird {
	
	// Class Members - Attributes
	private boolean fly = true;

	
	
	
    public void noise(){
        System.out.println("tweet");
    }

    
    
    
    
    @Override
	public String toString() {
		return "Bird [fly=" + fly + "]";
	}





	// getters and setters
    public boolean getFly(){
        return fly;
    }

    public void setFly(boolean newValueOfFly){
        this.fly = newValueOfFly;
    }


	
	
}
