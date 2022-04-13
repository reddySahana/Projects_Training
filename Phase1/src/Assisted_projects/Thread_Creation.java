package Assisted_projects;

public class Thread_Creation extends Thread {
	public void run(){  
		  System.out.println("thread is running...");  
		}  
		
		public static void main(String args[]){  
		
			Thread_Creation t1=new Thread_Creation();  // Step 1: create the object of the class
		   t1.start();                            // Step 2: starting the thread
	 }  

}
