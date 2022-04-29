package ninthStringBuilder;

public class SringBuilderEx2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("helloNepalNepalese");
        System.out.println("String is: "+str.toString());
        //loop via string and print every character
        for (int i=0; i<str.length();i++){
            //get char at position i
            char ch =str.charAt(i);
            //print char
            System.out.println("char at postion :" + i + " is " + ch);
        }



    }
}
