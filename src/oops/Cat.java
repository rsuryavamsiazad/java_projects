package oops;

/**
 *  Write a Java program to create a class called Animal with a method called makeSound(). 
 *  Create a subclass called Cat that overrides the makeSound() method to bark.
 */

class Animal{
	public void makeSound() {
		System.out.println("sound of the animal");
	}
}


public class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Bark");
	}
	public static void main(String[] args) {
		Cat c = new Cat();
		c.makeSound();
	}
}
