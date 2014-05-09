package basic.initializeandcleanup;
//: initialization/E11_FinalizeAlwaysCalled.java
/****************** Exercise 11 ****************
* Modify Exercise 10 so your
* finalize() will always be called.
***********************************************/
public class FinalizeAlwaysCall {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("eiheiheiheihei");
//		super.finalize();
	}

	public static void main(String[] args) {
		new FinalizeAlwaysCall();
		System.gc();
		System.runFinalization();

	}
/**
 * Calling System.gc( ) and System.runFinalization( ) in sequence will
 * probably but not necessarily call your finalizer (The behavior of finalize has been
 * uncertain from one version of JDK to another.) The call to these methods is just
 * a request; it doesn’t ensure the finalizer will actually run. Ultimately, nothing
 * guarantees that finalize( ) will be called.*/
}
