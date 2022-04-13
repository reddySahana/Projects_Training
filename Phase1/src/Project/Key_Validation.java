package Project;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class Key_Validation {

	public static void main(String[] args)throws IOException, InterruptedException 
	{
		Scanner sc = new Scanner(System.in);
		int choice,Fchoice,OPchoice,  fc=0,j, count=0;
		String st;
		File mFolder =new File("C:\\Users\\dell\\Key");
		mFolder.mkdir();
		String location = "C:\\Users\\dell\\Key";
		
		System.out.println("This is My Repository\n\n");
		System.out.println("Press Enter to continue...");
	    System.in.read();
	    System.out.print("\u000C");
        do {
        	choice=0;
	    System.out.println("My MENU");
	    System.out.println("Enter the option:");
	    System.out.println("1. Retrieve All Files inside Main Folder");
	    System.out.println("2. Perform File Operations");
	    System.out.println("3. Exit\n");
	    choice= sc.nextInt();
	    switch(choice) {
	    case 1:
	    	File Fobj = new File("C:\\Users\\dell\\Key");
			File Farray[] = Fobj.listFiles();
	    	for(int i=0;i<Farray.length;i++) {
	    		if(Farray[i].isFile()) {
	    			System.out.println("File: "+Farray[i] +"\n\n");
	    		}
	    		else if(Farray[i].isDirectory()) {
	    			System.out.println("Folder: "+Farray[i]+"\n\n");
	    		}
	    	}
	    	break;
	    case 2:
	    	do {
	    		count=0;
	    		System.out.print("\u000C");
	    	System.out.println("FOLDER/FILE ");
	    	System.out.println("Enter your option:");
		    System.out.println("1. Add File/Folder");
		    System.out.println("2. Delete File/Folder");
		    System.out.println("3. Search File/Folder");
		    System.out.println("4. Goback Main Menu");
		    System.out.println("5. Exit\n");
		    Fchoice= sc.nextInt();
		    switch(Fchoice) {
		    case 1:
		    		
		    	System.out.println("Add File/Folder");
		    	System.out.println(" Enter 1 for Folder,   Enter 2 for File:");
		    	OPchoice= sc.nextInt();
		    	switch(OPchoice) {
		    	case 1:
		    		System.out.println(" Enter the Folder name to be added");
		    		String str1 = sc.next();
		    		File addfolder = new File(location+"\\"+str1);
		    		if(addfolder.exists()) {
		    			System.out.println("If exists !! Please Enter Again\n");
		    		}
		    		else {
		    			addfolder.mkdir();
		    			System.out.println("!!New  Folder is created!!!\n");
		    		}
		    		break;
		    	case 2:
		    		System.out.println("Please Enter the File name with extension");
		    		String str2 = sc.next();
		    		File addfile = new File(location+"\\"+str2);
		    		if(addfile.exists()) {
		    			System.out.println("if exits !! Please Enter Again\n");
		    			}else {
		    				try {
		    					addfile.createNewFile();
		    					System.out.println("!!New file is created!!!\n");
		    				}catch(IOException e) {
		    					e.printStackTrace();
		    				}
		    			}
		    			
		    	break;
		    	default:
		    		System.out.println("Wrong Values are entered!!!!!\n");
		    	
		    	}
		    	
		    	break;
		    case 2:
		    	
		    		fc = 0;
		    	System.out.println("Want to Delete File or Folder?");
		    	System.out.println("Press 1 for Folder, Press 2 for File:");
		    	fc = sc.nextInt();
		    	switch(fc) {
		    		case 1:
		    		System.out.println(" Enter the Folder name to be deleted");
		    		st = sc.next();
		    		File delFolder = new File(location+"\\"+st);
		    		if(delFolder.exists()) {
		    			delFolder.delete();
		    			System.out.println("Folder Deleted\n");
		    		}
		    		else {
		    			System.out.println("!!Folder not Found!!!\n");
		    		}
		    		break;
		    		case 2: 
		    		System.out.println("Enter the File name to be deleted with extension ");
		    		st = sc.next();
		    		File delFile = new File(location+"\\"+st);
		    		if(delFile.exists()) {
		    			delFile.delete();
		    			System.out.println("File Deleted\n");
		    			}else {
		    				System.out.println("!!File not Found!!!\n");
		    			}
		    	break;
		    	default:
		    		System.out.println("Entered the wrong values!!!!!\n");
		    	}
		    	break;
		    	
		    case 3:
		    	System.out.println("Please Enter Name of File/Folder:");
		    	st = sc.next();
		    	File fsearch = new File("C:\\Users\\dell\\Key");
				File FSarray[] = fsearch.listFiles();
		    	for(int i=0;i<FSarray.length;i++) {
		    		if(FSarray[i].getName().startsWith(st)) {
		    			count++;
		    			if(FSarray[i].isFile()) {
			    			System.out.println("File: "+FSarray[i]+"\n\n");
			    		}
			    		else if(FSarray[i].isDirectory()) {
			    			System.out.println("Folder: "+FSarray[i]+"\n\n");
			    		}
		    		}    		
		    	}
		    	if(count==0)
		    		System.out.println("No Record found\n");
		    	break;
		    case 4: 
		    	break;
		    case 5:
		    	System.out.println("Thanks you");
		    	System.exit(1);
		    	break;
		    
		    default:
	    		 System.out.println("Wrong input");
		    
		    }
		    
		    System.out.println("Press Enter to continue...");
		    System.in.read();
	    	}while(Fchoice!=4);
	    	break;
	    case 3:
	    	System.out.println("Thanks you");
	    	System.exit(1);
	    	default:
	    		 System.out.println("Wrong input");
	    }
	    }while(choice!=3);
        sc.close();
        
	}

}
