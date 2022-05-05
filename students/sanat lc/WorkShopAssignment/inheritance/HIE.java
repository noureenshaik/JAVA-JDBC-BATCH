package com.inheritance;

class animal2
{
	void eat()
	{
		System.out.println("eating.....");
	}
}

class Dog2 extends animal2
{
	void bark2()
	{
		System.out.println("Barking......");
	}
}

class cat extends Dog2
{
	void meow()
	{
		System.out.println("Meow...");
	}
}


class HIE{
	public static void main(String args[])
	{
		cat c= new cat();
		c.eat();
		c.bark2();
		c.meow();
	}
}
