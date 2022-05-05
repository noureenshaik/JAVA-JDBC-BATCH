class A{
	public void printA() {
		System.out.println("class A");
	}
}
class B extends A{
	public void printB() {
		System.out.println("class B");
	}
}
class C extends A{
	public void printC() {
		System.out.println("class C");
	}
}
class D extends A{
	public void printD() {
		System.out.println("Class D");
	}
}

public class HierarchicalInheritance2 {
	public static void main(String [] args) {
		B b=new B();
		b.printA();
		b.printA();
		
		C c =new C();
		c.printA();
		c.printC();
		
		D d=new D();
		d.printA();
		d.printD();
	}

}
