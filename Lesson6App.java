package ru.geekbrains.Lesson1;

public class Lesson6App{
    public static void main( String [] args ) {

		Cat c = new Cat("Cat", 200.0, 2.0, 0.0);
		Dog d1 = new Dog("Dog spaniel", 500.0, 0.5, 10.0);
		Dog d2 = new Dog("Dog boxer", 600.0, 0.5, 10.0);

		c.run(100.0); 
		c.jump(3.0);
		c.swim(3.0);
		
		d1.run(550.0); 
		d1.jump(3.0);
		d1.swim(3.0);
		
		d2.run(550.0); 
		d2.jump(3.0);
		d2.swim(3.0);
		
    }
}
