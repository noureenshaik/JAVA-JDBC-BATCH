package com.polymorphism;

class Language {
	public void displayinfo() {
		System.out.println("Common English language");
	}
}

class Java extends Language {
	public void displayinfo() {
		System.out.println("Java Programming Language");
	}
}

class PMO_Ex1 {
	public static void main(String[] args) {
		Java j1 = new Java();
		j1.displayinfo();

		Language L1 = new Language();
		L1.displayinfo();
	}
}