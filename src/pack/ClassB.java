package pack;

public class ClassB extends ClassA{//single inheritance
	void methodB(){
		System.out.println("this is child class");
	}
	public static void main(String[] args){
		ClassB c=new ClassB();
		c.methodB();
		c.methodA();
	}

  
}
