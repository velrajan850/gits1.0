package demoo;

import java.util.Scanner;

public class mark2 {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int quiz;
	        int midterm; 
	        int finalscore;
	        int average;
	        System.out.println("insert quiz grade : ");
	        quiz = in.nextInt();
	        System.out.println("insert mid-term grade : ");
	        midterm = in.nextInt();
	        System.out.println("insert final grade : ");
	        finalscore = in.nextInt();
	        average = (quiz + midterm + finalscore) ;
	        if (average >= 90) {
	            System.out.println("grade=A");
	        }
	        if ((average >= 70) && (average < 90)) {
	            System.out.println("grade=B");
	        }
	        if ((average >= 50) && (average < 70)) {
	            System.out.println("grade=C");
	        }
	        if (average < 50) {
	            System.out.println("grade=F");
	        }

	    }

}
