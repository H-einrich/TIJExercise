package basic.initializeandcleanup;
//: initialization/E01_StringRefInitialization.java
/****************** Exercise 01 ****************
* Create a class with an uninitialized
* String reference. Demonstrate that this
* reference is initialized by Java to null.
***********************************************/
/**
 * @author zhangzimo
 * @date 2014-3-18
 * @description TODO
 */
public class StringUnInitialization {

	String s;
	/**
	 * @description TODO
	 * @param args
	 */
	public static void main(String[] args) {
		StringUnInitialization sui = new StringUnInitialization();
		System.out.println("sui.s = " + sui.s);
	}
	/*
	 * outPut:
	 * sui.s = null
	 * */

}
