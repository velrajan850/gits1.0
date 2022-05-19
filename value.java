package demoo;

import java.util.Scanner;
public class value {
	public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        
		        System.out.println("a. int 1x=10;");
		        System.out.println("b. int x=10;");
		        System.out.println("c. float x=10.0f;");
		        System.out.println("d. string x= \"10\"");
		        System.out.print("Enter ur choice : ");
		        char choice = in.next().charAt(0);
		        switch (choice) {
		            case 'a':
		                System.out.println("wrong answer");
		                break;
		            case 'b':
		                System.out.println("correct answer");
		                break;
		            case 'c':
		                System.out.println("wrong answer");
		                break;
		            case 'd':
		                System.out.println("wrong answer");
		                break;
		            default:
		                System.out.println( " dosen't exist ");

		        }
		    }
		}
	
	


