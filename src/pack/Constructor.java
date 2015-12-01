package pack;

public class Constructor {
	static String country="india";
	
	Constructor(){//parameter less constructor
	System.out.println("this is default constructor");
}
	Constructor(String name,String address,final String state){
		System.out.println("my name is:-" +name+  "my address:-"+address+  "my state is:-"+state+  "my country:-"+country);
		
	}

public static void main(String[] args){
	Constructor c=new Constructor();
	Constructor c1=new Constructor("mani", "HSR Layout","a.p");
}
}
