

public class A {
int a;
final int x=20;//constant
	A()
	{
		
	  System.out.println("A constructor");
		a=10;
		//x=30;
	}
	
	A(int a)
	{
		this.a=a;
	}
	
	
	 void display()
	{
		System.out.println("a="+a);
	}
}
