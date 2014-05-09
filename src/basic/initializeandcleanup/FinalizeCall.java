package basic.initializeandcleanup;
//: initialization/E10_FinalizeCall.java
/****************** Exercise 10 *****************
* Create a class with a finalize() method that
* prints a message. In main(), create an object
* of your class. Explain the behavior of your
* program.
************************************************/
public class FinalizeCall {
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("eiheiheihei");
//		super.finalize();
	}

	public static void main(String[] args) {
		new FinalizeCall();
	}
/**Exercise 10:
 * You probably won’t see the finalizer called because 
 * the program doesn’t usuallygenerate enough garbage 
 * for the collector to run.
 * */
}
