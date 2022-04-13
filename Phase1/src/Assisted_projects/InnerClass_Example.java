package Assisted_projects;



public class InnerClass_Example {
private int data=30;  
	
	void display(){
		System.out.println("i am inside the outer class method");
	}
	 
	class Inner{  		
	 //private int data=20;
	  
	  void msg()
	  {
		  System.out.println("data is "+data);
	  }  
	  
	  // calling the duplicate method of the outer class
	  void display(){
		  System.out.println("i am inside the inner class method");
	  }// inner class accessing the outside private variable
	 }  


	public static void main(String[] args) {
		InnerClass_Example obj=new InnerClass_Example();     // creating object of Outer class
		  
		InnerClass_Example.Inner in=obj.new Inner();   // creating object of Inner class
		  in.msg();  
		  in.display(); 


}
}
