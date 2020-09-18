
public class A {
int a;
	A()
	{
		
	  System.out.println("A constructor");
		a=10;
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
