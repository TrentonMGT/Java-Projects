package com.company;

public class Main {

    public static void main(String[] args) {
    	//Animal is a new instance of the Animal class
	    Animal animal = new Animal("Animal",1,1,1,7);
		//Creating another instance of the Dog class
	    Dog dog = new Dog("Boston Terrier", 20, 80, 2, 4,1,15,"Shiny");
		//override method
	    dog.eat();
	    //calling methods
	    dog.run();
	    dog.speed();
    }
}
