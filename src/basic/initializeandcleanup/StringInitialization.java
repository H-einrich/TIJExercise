package basic.initializeandcleanup;
//: initialization/E02_StringInitialization.java
/****************** Exercise 2 *****************
* Create a class with a String field initialized
* at the point of definition, and another one
* initialized by the constructor. What is the
* difference between the two approaches?
* The s1 field is initialized before the constructor is entered; technically, so is the
* s2 field, which is set to null as the object is created. The more flexible s2 field
* lets you choose what value to give it when you call the constructor, whereas s1
* always has the same value.
***********************************************/
public class StringInitialization {

	String sInitialized = "Initialized at definition";
	String sUnInitialized;
	
	public StringInitialization(String s){
		sUnInitialized = s;
	}
	/**
	 * @description TODO
	 * @param args
	 */
	public static void main(String[] args) {
		StringInitialization si = new StringInitialization("Initialize at construction");
		System.out.println("si.sInitialized = " + si.sInitialized);
		System.out.println("si.sUnInitialized = " + si.sUnInitialized);
	}
	/*	outPut:
	 * si.sInitialized = Initialized at definition
		si.sUnInitialized = Initialize at construction
		*/
	/*The s1 field is initialized before the constructor is entered; technically, so is the
	s2 field, which is set to null as the object is created. The more flexible s2 field
	lets you choose what value to give it when you call the constructor, whereas s1
	always has the same value.*/
}
