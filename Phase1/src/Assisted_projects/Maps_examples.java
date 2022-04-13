package Assisted_projects;
import java.util.*;

public class Maps_examples {
	public static void main(String[] args) {

		
	//Hashmap
		 Map<Integer, String> Lhm = new LinkedHashMap<Integer, String>();
			
			
			Lhm.put(1,"apple");
	        Lhm.put(2,"mango");
	        Lhm.put(3,"orange");
			Lhm.put(4,"banana");
			Lhm.put(5,"grapes");
	        Lhm.put(6,"kiwi");
	        Lhm.put(7,"strawberry");
			Lhm.put(8,"blueberry");
	        Lhm.put(9,"watermelon");
	        Lhm.put(10,"chikku");
	        System.out.println("Linkedhashmap is "+ Lhm);
	        for (Integer key : Lhm.keySet()) {
	            System.out.println(key + ":\t" + Lhm.get(key));
	        }
	        
	        System.out.println("Linkedhashmap after removing banana and value at key 7: "+ Lhm.remove(4, "banana") +"  "+Lhm.remove(7));
	        System.out.println("does contain banana :"+ Lhm.containsValue("banana"));
	        System.out.println("does contain apple: "+ Lhm.containsValue("apple")); 
	        System.out.println("does contain key 4: "+ Lhm.containsKey(4));
	        System.out.println("Hashcode is "+Lhm.hashCode() );
	        System.out.println("list is : "+Lhm);
	        Lhm.clear();
	        System.out.println("list is : "+Lhm);	      
	     
	        
	 //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Ales");  
	      ht.put(5,"Rosy");  
	      ht.put(6,"Jack");  
	      ht.put(7,"John");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	 //TreeMap
	      TreeSet<String> ts=new TreeSet<String>();
	        System.out.println("Enter the input Strings to be added in TreeSet");
	        
	        ts.add("python");
	        ts.add("java");
	        ts.add("C");
	        ts.add("C#");
	        ts.add("dotNet");
	        ts.add("C++");
	        System.out.println("the Programming languages are : "+ ts);
	        ts.remove("C");
	        ts.remove("java");
	        System.out.println("the Programming languages are : "+ ts);
	        ts.add("Mainframe");
	        ts.add("javascript");
	        ts.add("html");
	        System.out.println("Doen it  Contain java : "+ ts.contains("java"));
	        ts.clear();
	      
	            }
	}

