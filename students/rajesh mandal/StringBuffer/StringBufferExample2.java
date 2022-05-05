package com.takeo.string.buffer;

class StringBufferExample2{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello ");  
sb.insert(1,"Java");//now original string is changed  
System.out.println(sb);//prints HJavaello  
}  
}  
