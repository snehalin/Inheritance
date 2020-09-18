
public class B extends A//child class
{

	int b;
	int a;
	B()
	{
		//A()
		System.out.println("B constructor");
		b=20;
		a=30;
	}
	void display()//Method Overriding
	{
		System.out.println("b="+b+"a="+a+"A a="+super.a);
	}
}
