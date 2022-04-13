package Assisted_projects;

class Product {
	int id=78;
	String name = "Amul";
	void display()
	{
		System.out.println("id: "+id );
		System.out.println("name:"+name);
	}
	
}
class A extends Product{
	int count=50;
	String Category= "butter";
	void display()
	{
		System.out.println("id: "+id );
		System.out.println("name:"+name);
		System.out.println("count:"+count);
		System.out.println("category:"+Category);
	}
}

class subA extends A{
    int price=30;
    void totalprice() {
        int tp;
        tp=count*price;
        System.out.println("id: "+id );
		System.out.println("name:"+name);
		System.out.println("category:"+Category);  
        System.out.println("total price"+tp);
    }
}
class B extends Product{
    int count=90;
    String Category="Milk";
    void display() {
    	System.out.println("id: "+id );
		System.out.println("name:"+name);
		System.out.println("count:"+count);
		System.out.println("category:"+Category);
    }
}
class subB extends B{
    int price=10;
    void totalprice() {
        int tp;
        tp=count*price;
        System.out.println("id: "+id );
		System.out.println("name:"+name);
		System.out.println("category:"+Category);
        System.out.println("total price"+tp);
    }
}
class C extends Product{
    int count=56;
    String Category="choco";
    void display() {
    	System.out.println("id: "+id );
		System.out.println("name:"+name);
		System.out.println("count:"+count);
		System.out.println("category:"+Category);
    }
}
public class Inheretence_prog {
	public static void main(String[] args) {
		Product p= new Product();
	p.display();
	A s1=new A();
	s1.display();
	B s5=new B();
	s5.display();
	subA s2=new subA();
	s2.totalprice();
	subB s3=new subB();
	s3.totalprice();
	C s4=new C();
	s4.display();
	}
}
