
/*
 * @Author:Pawan_Acharya
 */
 public class Wrap {
	private int i;
	public Wrap() {
		
	}
	@Override
	public String toString() {
		return Integer.toString(i);
	}
	public Wrap(int i) {
		this.i =i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}



