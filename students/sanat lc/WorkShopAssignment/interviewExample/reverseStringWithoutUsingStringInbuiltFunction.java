package com.interviewExample;

public class reverseStringWithoutUsingStringInbuiltFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Saket Saurab";
char chars[]=str.toCharArray();
for(int i=chars.length-1;i<=0;i--)
{
	System.out.println(chars[i]);
}
	}

}
