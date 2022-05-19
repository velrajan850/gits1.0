package demoo;

import java.util.Scanner;

public class voter1 {
	  static int age;
	 public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("enter the age");
		 age=sc.nextInt();
	
			 if(age>=18)
			 {
			 System.out.println("your are eligiable for vote");
		 }
			 else
		 {
		 
			 System.out.println("your are not eligiable for vote");
		 }
		 
	 }
	 

}
