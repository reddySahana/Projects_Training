package Assisted_projects;

public class String_buffer_builder {

	public static void main(String[] args) {
		
		
StringBuffer St= new StringBuffer("Started Java ") ;
         System.out.println("String Buffer: ");
		St.append("Phase1");
		System.out.println(St);
		
		St.delete(2, 5);
		System.out.println(St);
		
		St.replace(4,7," Python");
		System.out.println(St);
		
		System.out.println("String Builder: ");
		
		StringBuilder str=new StringBuilder();
		
	     str.append(true);
	     System.out.println(str);
	     str.append('A');
	     System.out.println(str);
	     
	  

}
}
