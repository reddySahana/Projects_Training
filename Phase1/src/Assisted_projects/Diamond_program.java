package Assisted_projects;
interface ClassA 
{  
    default void show() 
    { 
        System.out.println("ClassA of DiamondProgram"); 
    } 
} 
interface Class_B 
{  
    default void show() 
    { 
        System.out.println("ClassB of DiamondProgram"); 
    } 
}  

public class Diamond_program implements ClassA,Class_B{
	public void show() 
    {  
       ClassA.super.show(); 
       Class_B.super.show(); 
    } 
    public static void main(String args[]) 
    { 
    	Diamond_program ob = new Diamond_program(); 
        ob.show(); 
    } 


}
