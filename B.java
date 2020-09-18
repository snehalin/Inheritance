
public class B extends A//child class
{

	int b;
	int a;
	B()
	{
		//super();//A();
		System.out.println("B constructor");
		b=20;
		a=30;
	}
	
	B(int x)
	{
		super(x);
		//super(x);
		b=x;
		a=x;
		
	}
	B(int x,int y,int z)
	{
		super(x);//parameterised parent
		b=y;
		a=z;
	}
	void display()//Method Overriding
	{
		System.out.println("b="+b+"a="+a+"A a="+super.a);
		super.display();//parent
	}
}
