
public class A {
int a;
int z;
A()
{
	System.out.println("A's Constructor");
	a=10;
	z=100;
}
void display()
{
	System.out.println("In Parent class "+ "a="+a);
}

void add()
{
	System.out.println(a+10+"-- A's Add()");
	
}
}
