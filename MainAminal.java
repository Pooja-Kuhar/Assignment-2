package ASSIGNMENT2;



	class Animal {
	    // Method to be overridden by subclasses
	    public void makeSound() {
	        System.out.println("Animal makes a sound");
	    }
	}
	class Dog extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("Woof");
	    }
	}
	class Cat extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("Meow");
	    }
	}
	public class MainAminal {
	    public static void main(String[] args) {
	        // Create instances of Dog and Cat
	        Animal myDog = new Dog();
	        Animal myCat = new Cat();

	        // Call the makeSound method on both objects
	        myDog.makeSound(); // Outputs: Woof
	        myCat.makeSound(); // Outputs: Meow

	        // Demonstrating polymorphism
	        Animal myAnimal;

	        myAnimal = new Dog();
	        myAnimal.makeSound(); // Outputs: Woof

	        myAnimal = new Cat();
	        myAnimal.makeSound(); // Outputs: Meow
	    }
	}

	
