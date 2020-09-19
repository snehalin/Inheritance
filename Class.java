
public class Class extends Department {

	String name;
	int no_of_student;
	
	Class()
	{
		name="TE";
		no_of_student=60;
	}
	
	Class(String cname,String adr,int cid,int nofdept,
			String name,int nofstd)//
	{
		super(cname,adr,cid,nofdept);
		this.name=name;
		no_of_student=nofstd;
	}
	void display()
	{
		super.display();//Department
		System.out.println("Class="+name+"\nno_of_student="+no_of_student);
	}
}
