package com.polymorphism;

public class ReadOnlyClass {
	
	private String collage="AKG";
	
	public String getCollege() {
		return collage;
	}

}

s.setCollage("KITE");
class StudentX{
	private String collage;
	public void setCollage(String collage) {
		this.collage=collage;
		
		System.out.println(s.getCollage());
		System.out.println(s.collage);
	}
}
