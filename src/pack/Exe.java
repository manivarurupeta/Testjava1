package pack;

public class Exe {

	public static void main(String[] args) {
	Examfindminandmax e=new Examfindminandmax();
	Variables v=new Variables();
	Method m=new Method();

	
	
	System.out.println("***********byte**********");
	 e.byteminmax();
	 System.out.println("***********short**********");
	 e.shortminmax();
	 System.out.println("***********integer**********");
	 e.intminmax();
	 System.out.println("***********long**********");
	 e.longminmax();
	 System.out.println("***********float**********");
	 e.floatminmax();
	 System.out.println("***********double**********");
     e.doubleminmax();
     System.out.println("***********char**********");
     e.chard();
     System.out.println("***********boolean**********");
     e.booleand();
     System.out.println("@@@@variables class@@@@");
     v.nonstaticmethod();
     v.staticmethod();
     System.out.println("@@@@method class@@@@");
     m.m1();//in this case we are not pass any value
     m.m2(12, 24);//in this case we pass the values
     
    
     
     
	}
	

}
