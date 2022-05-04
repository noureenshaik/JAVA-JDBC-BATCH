package com.wrapperclass;

class WrapperExample5 {
	private int i;

	WrapperExample5() {
	}

	WrapperExample5(int i) {
		this.i = i;
	}

	public int getValue() {
		return i;
	}

	public void setValue(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return Integer.toString(i);
	}
}

//Testing the custom wrapper class
public class WrapperExample4 {

	public static void main(String[] args) {
		WrapperExample5 wr = new WrapperExample5(10);
		System.out.println(wr);
		System.out.println(wr.toString());

	}

}
