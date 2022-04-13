package Assisted_projects;

class EmpInfo{
	int id ;
	String name;

void display(int i, String string) {
	id=i;
	name=string;
	System.out.println("This is parameterised constructor");
	System.out.println(id+" "+name);
	}
void display1() {
	 id= 10;
	 name= "abc";
	 System.out.println("This is a constructor");
	System.out.println(id+" "+name);
	}

}


public class Constructors {
	public static void main(String[] args) {

		EmpInfo emp1=new EmpInfo();
		EmpInfo emp2=new EmpInfo();

		emp1.display(2,"acs");
		emp2.display(3,"sdg");
		emp1.display1();
		}
}
