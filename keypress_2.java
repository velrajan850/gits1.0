package demoo;

import java.util.Scanner;

public class keypress_2 {
	
		 public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        System.out.println("press a key : ");
		        char key = in.next().charAt(0);
		        switch (key) {
		            case '0':
		                System.out.println("you pressed 0. ");
		                break;
		            case '1':
		                System.out.println("you pressed 1. ");
		                break;
		            case '2':
		                System.out.println("you pressed 2. ");
		                break;
		            case '3':
		                System.out.println("you pressed 3. ");
		                break;
		            case '4':
		                System.out.println("you pressed 4. ");
		                break;
		            case '5':
		                System.out.println("you pressed 5. ");
		                break;
		            case '6':
		                System.out.println("you pressed 6. ");
		                break;
		            case '7':
		                System.out.println("you pressed 7. ");
		                break;
		            case '8':
		                System.out.println("you pressed 8. ");
		                break;
		            case '9':
		                System.out.println("you pressed 9. ");
		                break;
		            default:
		                System.out.println("Not Allowed");
		        }

		    }
		}

		


