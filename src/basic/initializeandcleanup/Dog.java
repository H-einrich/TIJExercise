package basic.initializeandcleanup;
//: initialization/E05_OverloadedDog.java
/****************** Exercise 5 *****************
* Create a class called Dog with an overloaded
* bark() method. Your method should be
* overloaded based on various primitive data
* types, and should print different types of barking,
* howling, etc., depending on which overloaded
* version is called. Write a main() that calls
* all the different versions.
***********************************************/
/****************** Exercise 6 ******************
* Modify Exercise 5 so two of the overloaded
* methods have two arguments of two different
* types, but in reversed order relative to each
* other. Verify that this works.
************************************************/
import java.lang.Object;

public class Dog {

	public void bark(){
		System.out.println("Default bark.");
	}
	
	public void bark(int i){
		System.out.println("int bark = howl~~");
	}
	
	public void bark(double d){
		System.out.println("double bark = howl~~~~~~~");
	}
	
	public void bark(String s){
		System.out.println("String bark = yip!!!");
	}
	//exercise 6
	public void bark(int i, double d){
		System.out.println("int double bark.");
	}
	
	public void bark(double d, int i){
		System.out.println("double int bark.");
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println("Exercise 5: ");
		dog.bark();
		dog.bark(1);
		dog.bark(1.1);
		dog.bark("eihei");
		System.out.println("Exercise 6: ");
		dog.bark(1, 1.1);
		dog.bark(1.1, 1);
	}
	/**
	 * outPut:
	 * Exercise 5: 
	 * Default bark.
	 * int bark = howl~~
	 * double bark = howl~~~~~~~
	 * String bark = yip!!!
	 * Exercise 6:
	 * int double bark.
	 * double int bark.
	 * */
}
