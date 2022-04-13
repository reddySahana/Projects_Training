package Assisted_projects;


public class Method_overloading {
	int  calculate(int a,int b)
	{
		System.out.println("addition :"+(a+b));
		return 0;
		
	}
	 float calculate(float r)
	{
       System.out.println("Area of a circle :"+(3.14*r*r));
	return 0;
       
	}
     int calculate(int b,long h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*(int)h));
		return 0;
		
    }
     
     public static void main(String[] args)
 	{ 
 	Method_overloading obj=new Method_overloading();
 	obj.calculate(2,4); 
 	obj.calculate(2.0f);
 	obj.calculate(2,2l);
 	}

}
