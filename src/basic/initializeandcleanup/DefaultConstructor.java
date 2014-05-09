package basic.initializeandcleanup;
//: initialization/E03_DefaultConstructor.java
/****************** Exercise 3 ******************
* Create a class with a default constructor (one
* that takes no arguments) that prints a
* message. Create an object of this class.
************************************************/
/**
 * @author zhangzimo
 * @date 2014-3-19
 * @description TODO
 */
public class DefaultConstructor {

	DefaultConstructor () {
		System.out.println("Default constructor");
	}
	DefaultConstructor (String s){
		System.out.println("Overloading constructor");
		System.out.println("input String : "+s);
	}
	/**
	 * @description TODO
	 * @param args
	 */
	public static void main(String[] args) {
		new DefaultConstructor();
		new DefaultConstructor("eihei");
	}

}
