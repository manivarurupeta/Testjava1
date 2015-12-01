package pack;

public class Variables {
	int i=20;
	static int j=15;
	final String addres="HSR Layout";
	static final String country="india";
	void nonstaticmethod(){
		int a=10;
		System.out.println("this is non static method and a is local variable"+a);
		System.out.println("adition of a & i"+(a+i));
		System.out.println("adition of i & j   "+(i+j));
		System.out.println("mani sreate"+addres+"his country"+country);
	}
	static void staticmethod(){
		int h=30;
		final String streat="marthahalli";
		
		System.out.println("this is static method and h is local variable"+h);
		//System.out.println("addition of i & h"+(i+h)); we can not access non-static variable in static method
		System.out.println("addition of h & j  "+(h+j));
	
		//System.out.println("mani address"+addres+);we can not access non-static variable in static method
		System.out.println("mani address"+streat+"his country"+country);
	}

}
