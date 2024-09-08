//Develop a simple program to demonstrate the concept of abstract classes and interfaces.
 
package week3;
//Abstract class
abstract class Animal {
 private String name;

 public Animal(String name) {
     this.name = name;
 }

 public String getName() {
     return name;
 }

 // Abstract method (must be implemented by subclasses)
 public abstract void makeSound();

 // Concrete method
 public void eat() {
     System.out.println(name + " is eating.");
 }
}

//Interface
interface Domestic {
 void play();
}

//Derived class Dog that extends Animal and implements Domestic
class Dog extends Animal implements Domestic {
 public Dog(String name) {
     super(name);
 }

 @Override
 public void makeSound() {
     System.out.println(getName() + " says: Woof Woof!");
 }

 @Override
 public void play() {
     System.out.println(getName() + " is playing fetch.");
 }
}

//Derived class Cat that extends Animal but does not implement Domestic
class Cat extends Animal {
 public Cat(String name) {
     super(name);
 }

 @Override
 public void makeSound() {
     System.out.println(getName() + " says: Meow Meow!");
 }
}

public class InterfaceDemoMain {

	public static void main(String[] args) {
		Animal myDog = new Dog("Leo");
        Animal myCat = new Cat("Oscar");

        // Test Dog
        myDog.makeSound();
        myDog.eat();
        if (myDog instanceof Domestic) {
            ((Domestic) myDog).play();
        }

        // Test Cat
        myCat.makeSound();
        myCat.eat();
        

	}

}
