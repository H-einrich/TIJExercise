package heinrich.normal.serializable;

import java.io.Serializable;

public class Thing2 implements Serializable {
	private static final long serialVersionUID = 562109976009813885L;

	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	Thing2(){
		System.out.println("Thing2 was called.");
	}

	public Thing2(int id) {
		this.setId(id);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("").append("");
		return sb.toString();
	}
	
}
