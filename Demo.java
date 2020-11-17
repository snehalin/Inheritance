//Inheritance:-It is OOPS methology in which one class can be derived 
//from another  existing class
/*
 1.Single/Simple -1p 1 ch
 2.Multilevel-
  A  --p
  |
  B--ch,p
  |
  C---ch
 
 3.Multiple--> 2 or more p only 1 ch
 x=20 x=30
 m1()   m1()
  A   B ...... Parent
  |___|
    |
    C x=? m1()=?  
    
    
        child
    
    
    
    
 4.Hierarchical --> 1 p and 2 or more  ch
 
 	A
 	/\\\\
 	B C... 
 
 5.Hybrid--->Combination of any 2 two Inheritance
     A
     | 
     C
    / \
    S  F
    |
    P
 A (Parent,Base,Super)
 |
 B (Child,Derived,Sub)
 
 class A 
 {---
 }
 
 class B extends A
 {
 ---
 }
 
 Super ---> Keyword used to access Parents class Properies
 */
public class Demo {
public static void main(String args[])
{
	
	
/*	C ob1=new C();
	ob1.displayC();//c
	//ob.displayC();
	ob1.display();//b
	ob1.print();//a
	
	*/
	B b1=new B();
	b1.add();
	b1.print();
	
}
}
