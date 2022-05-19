package demoo;

import java.util.Scanner;

public class revenune {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int unitprice, quantity;
        double revenue, afterdiscount, discount = 0;
        System.out.println("Enter unit price:");
        unitprice = in.nextInt();
        System.out.println("Enter quantity:");
        quantity = in.nextInt();
        revenue = unitprice * quantity;
        System.out.println("The revenue from sale: " + revenue );
        if ((quantity >= 100) && (quantity <= 120)) {
            discount = (revenue * 10) / 100;
        }
        if (quantity > 120) {
            discount = (revenue * 15) / 100;
        }
        if (quantity < 100) {
            discount = (revenue * 0) / 100;

        }
        afterdiscount = revenue - discount;
        System.out.println("After discount: " + afterdiscount  );

    }

}
