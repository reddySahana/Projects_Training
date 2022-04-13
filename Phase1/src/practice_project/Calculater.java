package practice_project;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		char operator;
		 Double num1, num2, result;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Choose an operator: +, -, *, /");
		 operator = scan.next().charAt(0);
		 System.out.println("Enter the First number: ");
		 num1 = scan.nextDouble();
		 System.out.println("Enter The Second Number: ");
		 num2 = scan.nextDouble();
		 
  switch (operator){
		 case '+':
		 result = num1 + num2;
		System.out.println(result);
		 break;
		 case '-':
		 result = num1 - num2;
		 System.out.println(result);
		 break;
		 case '*':
		 result = num1 * num2;
		System.out.println(result);
		 break;
		 case '/':
		 result = num1 / num2;
		System.out.println(result);
		 break;
		 default:
		 System.out.println("Invalid operator!");
		 break;

	}

}
}
