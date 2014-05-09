package heinrich.normal.serializable;

import java.io.Serializable;

public class SerializableTest implements Serializable {

	private static final long serialVersionUID = 2849597338034426104L;
	
	protected String a = "test";
	protected int b = 2;
	
	public SerializableTest(){
		System.out.println("SerializableTest");
	}
	

}
