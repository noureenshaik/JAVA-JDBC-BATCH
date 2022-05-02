package Wrapper;
//Java Program to convert all primitives into its corresponding   
//wrapper objects and vice-versa  

public class JavaWrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	byte b=10;
	short s=20;
	int i=30;
	long l=40;
	float f=50.0F;
	double d=60.0D;
	char c='a';
	boolean b2=true;
	
	//Autoboxing: Converting primitives into objects  
	Byte byteobj=b;
	Short shortobj=s;
	Integer intobj=i;
	Long longobj=l;
	Float floatobj=f;
	Double doubleobj=d;
	Character charobj=c;
	Boolean boolobj=b2;
	
	//printing objects
	System.out.println("---Printing object values---");
	System.out.println("Byte object: "+byteobj);
	System.out.println("Short object:"+shortobj);
	System.out.println("Integer object:"+intobj);
	System.out.println("Long object:"+longobj);
	System.out.println("Float object:"+floatobj);
	System.out.println("Double object:"+doubleobj);
	System.out.println("Character object:"+charobj);
	System.out.println("Boolean object:"+boolobj);
	
	
	//Unboxing: converting objects to primitives
	byte bytevalue=byteobj;
	short shortvalue=shortobj;
	int intvalue=intobj;
	long longvalue=longobj;
	float floatvalue=floatobj;
	double doublevalue=doubleobj;
	char charvalue=charobj;
	boolean boolvalue=boolobj;
	
	//Printing Primitives
	System.out.println("---Printing primitive values---");
	System.out.println("byte value: "+bytevalue);
	System.out.println("Short value:"+shortvalue);
	System.out.println("int value:"+intvalue);
	System.out.println("Long value:"+longvalue);
	System.out.println("Float value:"+floatvalue);
	System.out.println("double value :"+doubleobj);
	System.out.println("Char value:"+charvalue);
	System.out.println("Boolean value:"+boolvalue);
	
	



	
}
}


/// output : ---Printing object values---
//Byte object: 10
//Short object:20
//Integer object:30
//Long object:40
//Float object:50.0
//Double object:60.0
//Character object:a
//Boolean object:true
//---Printing primitive values---
//byte value: 10
//Short value:20
//int value:30
//Long value:40
//Float value:50.0
//double value :60.0
//Char value:a
//Boolean value:true
