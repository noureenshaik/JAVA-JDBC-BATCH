
public class WrapperAndPrimitiveDatatype {

	public static void main(String [] args) {
		int i=10;
		byte b=20;
		short s=30;
		long l=40;
		float f=50;
		double d=50;
		char c='d';
		boolean bo=true;
		//AutoBoxing -converting primitive data into wrapper object
		Integer in=i;
		Byte by=b;
		Short sh=s;
		Long lo=l;
		Float fl=f;
		Double dl=d;
		Character ch=c;
		Boolean bl=bo;
		

		System.out.println("Integer Object ="+in);
		System.out.println("Byte Object ="+by);
		System.out.println("Short Object ="+sh);
		System.out.println("Long Object ="+lo);
		System.out.println("Float Object ="+fl);
		System.out.println("Double Object ="+dl);
		System.out.println("Character Object ="+ch);
		System.out.println("Boolean Object ="+bl);
		
		//UnBoxing = converting object to Primitive datatypes
		
		int i1=in;
		byte b1=by;
		short s1=sh;
		long l1=lo;
		float f1=fl;
		double d1=dl;
		char c1=ch;
		boolean bo1=bo;
		
		System.out.println("Primitive values are ");
		System.out.println(i1);
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(c1);
		System.out.println(bo1);
		
				
		
		
	}
}
