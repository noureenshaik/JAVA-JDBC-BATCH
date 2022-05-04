package eighthStringBuffer;

public class SringBufferCapacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append("Kya huwa rahe lol");
        System.out.println(sb.capacity());


    }
}
