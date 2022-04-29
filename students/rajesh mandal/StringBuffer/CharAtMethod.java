package com.takeo.string.buffer;

class CharAtMethod {
    public static void main(String[] args)
    {
  
        // create a StringBuilder object
        StringBuilder str = new StringBuilder();
  
        // add the String to StringBuilder Object
        str.append("Geek");
  
        // get char at position 1
        char ch = str.charAt(1);
  
        // print the result
        System.out.println("StringBuilder Object"
                           + " contains = " + str);
        System.out.println("Character at Position 1"
                           + " in StringBuilder = " + ch);
    }
}
