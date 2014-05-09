package heinrich.normal.serializable;

import java.io.Serializable;

public class Thing1 implements Serializable{
	private static final long serialVersionUID = -4672288868125452636L;

	private Thing2 next;
	
	public Thing1 (int id){
		next = new Thing2(id);
	}
	
	Thing1(){
		System.out.println("thing1 was called.");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("").append(next).append("");
		return super.toString();
	}
}
