package ninthStringBuilder;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append("Hello");
        char ch = sb.charAt(1);
        System.out.println("String builder object Contains = "+ sb);
        System.out.println("String builder at position 1 in string builder: =- "+ ch);



    }
}
