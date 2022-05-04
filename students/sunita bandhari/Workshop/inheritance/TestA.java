package com.inheritance;

public class TestA {

	public static void main(String[] args) {
		B obj_B = new B();
        obj_B.print_A();
        obj_B.print_B();
 
        C obj_C = new C();
        obj_C.print_A();
        obj_C.print_C();
 
        D obj_D = new D();
        obj_D.print_A();
        obj_D.print_D();
	}

}
