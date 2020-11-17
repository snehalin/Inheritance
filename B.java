
public class B extends A {
int b;
int z;
B()
{//A()
	super();
	System.out.println("B's Constructor");
	b=20;
	z=200;
	//super();
}
void print()
{
	System.out.println("In child class a="+a+"b="+b
			+"z="+z+"parent z="+super.z);
  
}

void add()//MethodOverriding
{
	System.out.println(b+10+"--> B's Add()");
	super.add();//A class add()
}
}
