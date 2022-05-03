package wrapperclass;

public class CustomWrapperClass {
	private int i;
	
	

	public CustomWrapperClass() {
		super();
	}

	public CustomWrapperClass(int i) {
		super();
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	@Override  
	public String toString() {  
	  return Integer.toString(i);  
	} 

}
