
public class College {
String name,adress;
int collegeid;

College()
{
	name="Orchid COE";
	adress="Solapur";
	collegeid=1980;
}

College(String name,String adr,int id)
{
	this.name=name;
	adress=adr;
	collegeid=id;
}
void display()
{
	System.out.println("College Name"+name+"\nadress"+adress
			+"College id="+collegeid
			);
}


}
