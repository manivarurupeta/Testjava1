package pack;

import sun.awt.AWTAccessor.SystemColorAccessor;

public class Method {
	void m1(){
		
		int i=10;
		 int j=20;
		System.out.println("this method is parameterless method");
		System.out.println("addition of i and j  "+(i+j));
	
	}
	void m2(final int h,final int k){//we can pass any variable with out static final variable 
		System.out.println("this method is parameterized method");
	    System.out.println("addition of two parameters"+(h+k));
	}
	//static void m3(static int m,static int n){
		
	

}
