package ru.geekbrains.Lesson1;

public abstract class Animal{
    protected String animalName;
    protected double maxDistanceToRun;
    protected double maxDistanceToJump;
    protected double maxDistanceToSwim;	

	public boolean run(double distance){
		String s = Double.toString(distance);
		System.out.println("\n"+this.animalName+" wants to run on the distance: "+s+" meters.");
		if (distance <= maxDistanceToRun) {
			System.out.println("It's possible");
			return true;
		} else {
			System.out.println("It's impossible");
			return false;
		}
	}
	
	public boolean jump(double distance){
		String s = Double.toString(distance);
		System.out.println("\n"+this.animalName+" wants to jump on the distance: "+s+" meters.");
		if (distance <= maxDistanceToJump) {
			System.out.println("It's possible");
			return true;
		} else {
			System.out.println("It's impossible");
			return false;
		}
	}
	public boolean swim(double distance){
		String s = Double.toString(distance);
		System.out.println("\n"+this.animalName + " wants to swim on the distance: " + s + " meters.");
		if (distance <= maxDistanceToSwim) {
			System.out.println("It's possible");
			return true;
		} else {
			System.out.println("It's impossible");
			return false;
		}
	}
    public void display(){
        System.out.println("Name: "+this.animalName);
    }	

}




