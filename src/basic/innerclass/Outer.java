package basic.innerclass;
import static heinrich.common.Print.print;
/****************** Exercise 1 *****************
* Write a class named Outer containing an
* inner class named Inner. Add a method to Outer
* that returns an object of type Inner. In
* main(), create and initialize a reference to
* an Inner.
***********************************************/
public class Outer {

	class Inner{
		Inner(){
			print("Inner class created.");
		}
	}
	
	public Inner getInner(){
		return new Inner();
	}
	
	public static void main(String[] args) {
		Outer o = new Outer();
		o.getInner();
	}
}
