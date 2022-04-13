package Assisted_projects;

public class Str_search {
	public static void main(String[] args) {
		String[] strArray3 = { "R", "S", "T","L","K" };
		boolean found = false;
		int index = 0;
		String s = "N";
		for (int i = 0; i < strArray3.length; i++) {
		if(s.equals(strArray3[i])) {
		index = i; found = true; break;
		}
		}
		if(found)
		System.out.println(s +" found at the index "+index);
		else
		System.out.println(s +" not found in the array");
		}

}
