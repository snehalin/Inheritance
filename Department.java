
public class Department extends College{
int no_of_dept;
Department()
{
	no_of_dept=5;
}
Department(String cname,String adr,int cid,int no_of_dept)
{
	super(cname,adr,cid);
	this.no_of_dept=no_of_dept;
}

void display()
{
	super.display();//college
	System.out.println("no of dept="+no_of_dept);
}
	
}
