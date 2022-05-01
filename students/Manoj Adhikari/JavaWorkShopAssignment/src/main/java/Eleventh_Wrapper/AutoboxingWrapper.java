package Eleventh_Wrapper;

public class AutoboxingWrapper {
    public static void main(String[] args) {
        //converting into integer
        int a =20;
        // converting int into Integer explicityly
        Integer i = Integer.valueOf(a);
        Integer j = j=a; //Autoboxing
        System.out.println(a+"\t"+i+"\t"+j);
    }
}
