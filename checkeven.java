package demoo;

import java.util.Scanner;

public class checkeven {

		  static int number;
		 public static void main(String[] args) {
			 Scanner sc = new Scanner (System.in);
			 System.out.println("enter the  number");
			 number=sc.nextInt();
			 
				 if(number%2==0)
				 {
				 System.out.println("enter the number is even");
			 }
				 else
			 {
			 
				 System.out.println("enter the number is not even");
			 }

}
}