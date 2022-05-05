package Inheritance;

public class Test {
    public static void main(String args[]) {

        MounntainBike mb = new MounntainBike(3, 100, 25);
        System.out.println(mb.toString());
        System.out.println("");

        System.out.println("Java program for single inheritance");
        singleTwo s = new singleTwo();
        s.print_geek();
        ;
        s.print_for();
        s.print_geek();
        System.out.println("");

        System.out.println("Java program for Multi inheritance");
        three g = new three();
        g.printGeeek();
        g.printFor();
        ;
        g.printGeeek();
        System.out.println("");

        System.out.println("Java program for Hierarchical inheritance");
        B obj_B = new B();
        obj_B.print_A();
        obj_B.print_B();

        C obj_C = new C();
        obj_B.print_A();
        obj_C.print_C();

        D obj_D = new D();
        obj_D.print_A();
        obj_D.print_D();
    }
}