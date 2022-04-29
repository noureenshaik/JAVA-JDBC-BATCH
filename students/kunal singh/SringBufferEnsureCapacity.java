package ninthStringBuilder;

public class SringBufferEnsureCapacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        //default capacity
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append("Kya huwa rahe lol");
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());


    }
}
