package com.inheritance;

class animal1{
	void eat()
	{
		System.out.println("Eating...");
	}
}


class dog1 extends animal1{
	
	void bark()
	{
		System.out.println("Barking...");
	}
}

class BabyDog extends dog1
{
	void weep()
	{
		System.out.println("Weeping..");
	}
}


class MIE1
{
	public static void main(String args[])
	{
		
		BabyDog bd= new BabyDog();
		bd.weep();
		bd.bark();
		bd.eat();
		
				
	}
}