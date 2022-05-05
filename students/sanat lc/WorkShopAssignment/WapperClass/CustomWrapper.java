package com.WapperClass;

public class CustomWrapper {

	//Test
		private int i;  
		CustomWrapper(){}  
		CustomWrapper(int i){  
		this.i=i;  
		}  
		public int getValue(){  
		return i;  
		}  
		public void setValue(int i){  
		     this.i=i;  
		}  
		
		public String toString() {  
		  return Integer.toString(i);  
		}  
		  
		//Testing the custom wrapper class  
	
		public static void main(String[] args){  
			CustomWrapper j=new CustomWrapper(10);  
		System.out.println(j);  
		}}
		
