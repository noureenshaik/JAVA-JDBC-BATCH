package Eleventh_Wrapper;

public class UnboxingWrapper {
    public static void main(String[] args) {
        Integer a = new Integer(3);
        int i = a.intValue();//converting Integer to int explicity
        int j=a;//unboxing
        System.out.println(a +"\t"+ i +"\t"+ j);
    }
}
