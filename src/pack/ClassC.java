package pack;

public class ClassC extends ClassB{//multilevel inheritance 
     void methodC(){
    	 System.out.println("this is sub child class");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC sc=new ClassC();
		sc.methodA();sc.methodB();sc.methodC();

	}

}
