package com.wrapperclass;

public class WrapperExample3 {

	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50.0f;
		double d = 60.0;
		char c = 'a';
		boolean b2 = true;
		
		//Autoboxing: Converting primitives into objects
		Byte byteObj = b;
		Short shortObj = s;
		Integer intObj = i;
		Long longObj = l;
		Float floatObj = f;
		Double doubleObj = d;
		Character charObj = c;
		Boolean boolObj = b2;
		
		System.out.println("---Printing object values---");  
		System.out.println("Byte object: "+byteObj);  
		System.out.println("Short object: "+shortObj);  
		System.out.println("Integer object: "+intObj);  
		System.out.println("Long object: "+longObj);  
		System.out.println("Float object: "+floatObj);  
		System.out.println("Double object: "+doubleObj);  
		System.out.println("Character object: "+charObj);  
		System.out.println("Boolean object: "+boolObj);  
		  
		//Unboxing: Converting Objects to Primitives  
		byte byteValue=byteObj;  
		short shortValue=shortObj;  
		int intValue=intObj;  
		long longValue=longObj;  
		float floatValue=floatObj;  
		double doubleValue=doubleObj;  
		char charValue=charObj;  
		boolean boolValue=boolObj;  
		  
		//Printing primitives  
		System.out.println("---Printing primitive values---");  
		System.out.println("byte value: "+byteValue);  
		System.out.println("short value: "+shortValue);  
		System.out.println("int value: "+intValue);  
		System.out.println("long value: "+longValue);  
		System.out.println("float value: "+floatValue);  
		System.out.println("double value: "+doubleValue);  
		System.out.println("char value: "+charValue);  
		System.out.println("boolean value: "+boolValue);  

		
	}

}
