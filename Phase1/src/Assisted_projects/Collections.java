package Assisted_projects;
import java.util.*;

public class Collections {
	public static void main(String[] args) {
		
		
//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Karnataka");//
	      city.add("Delhi"); 
	      city.add(1, "India");
	      System.out.println(city);  
		
		
	      
//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(25); 
	      vec.addElement(30); 
	      System.out.println(vec);
		
		
//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      int i=0;
			 LinkedList<String> LL = new LinkedList<String>();

		        LL.add("April");
		        LL.add("May");
		        LL.add("June");
		        LL.add("July");
		        LL.add("August");  
		        LL.add("November");
		        LL.addLast("December");
		        LL.addFirst("January");
		        LL.add(1,"March");
		        LL.add(1,"Febuary");
		        LL.add(8,"Septemeber");
		        LL.add(9,"October");
		        System.out.println("the list is : " +LL);
		      
		       Iterator itr=LL.iterator();
		                while(itr.hasNext()) {
		                System.out.println("list is"+ itr.next());
		                }
		                
		                System.out.println("the first and last months are : "+LL.getFirst()+"   "+LL.getLast());
		                   
		                System.out.println("Birthday month is " + LL.remove(3));
		                
		         
		         System.out.println("list is" + LL);
		         System.out.println("does list contain December :"+ LL.contains("December"));
		        System.out.println("first and last month using Peek :"+LL.peekFirst()+"  "+LL.peekLast() );
		        System.out.println("first and last month using Peek :"+LL.peekFirst()+"  "+LL.peekLast() );
		        System.out.println("list is" + LL);  
	       
		        
//creating hashset and linkedhashset
	       System.out.println("\n");
	       System.out.println("HashSet and LinkedHashSet ");
	       LinkedHashSet lhs=new LinkedHashSet<String>();
			HashSet<String> hs=new HashSet();
			hs.add("black");
			hs.add("1");
			hs.add("red");
			hs.add("white");
			hs.add("yellow");
			
			
			lhs.add(1);
			lhs.add("c");
			lhs.add("cat");
			lhs.add("a");
			lhs.add('s');
			
					
					
			System.out.println("Hashset is "+hs);
			System.out.println("Size of Hashset is "+ hs.size());
			
			System.out.println("Does hashset contains this 'u' element  " + hs.contains("u"));		
			System.out.println("is hashset empty  " + hs.isEmpty());
			System.out.println("remove the element "+hs.remove("white"));

		    hs.clear();
		    System.out.println("get class  " +hs.getClass());
			
		    System.out.println("is hashset empty  " +hs.isEmpty());
			
			System.out.println("Hashset is "+lhs);
			System.out.println("Size of Hashset is "+ lhs.size());
			
			System.out.println("Does hashset contains this 'u' element  " + lhs.contains("u"));		
			System.out.println("is hashset empty  " + lhs.isEmpty());
			System.out.println("remove the element "+lhs.remove("a"));
		    lhs.clear();
		    System.out.println("get class  " +lhs.getClass());
			
		    System.out.println("is hashset empty  " +lhs.isEmpty());
			
	       
	     
        }
	}
