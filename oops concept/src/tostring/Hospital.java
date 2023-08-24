package tostring;

public class Hospital {
	String name;
	long mobno;

String location;
public Hospital (String name ,long mobno,String location)


{
this.name=name;
this.mobno=mobno;
this.location =location;


}

public String toString() {
	
	
	return " Mobno- " +mobno + " Name- "+name + " Location- "+location;
}
}
