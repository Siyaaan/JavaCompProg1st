import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        //USERS INPUT OF PRICE AND DISCOUNT//
        Scanner priceInput = new Scanner(System.in);
        Scanner discountInput= new Scanner(System.in);

            System.out.print("Enter Original Price: ");
            int price = priceInput.nextInt();

            System.out.print("Enter Discount: ");
            int discount = discountInput.nextInt();

        priceInput.close();
        discountInput.close();

        //PRICE AND DISCOUNT PROCESS
        int discountAmount = (int)(price * ((double)discount / 100));
        // Calculate the final price after applying the discount
        int finalPrice = price - discountAmount;

        // Output the final price
        System.out.println("Final Price: " + finalPrice);
    }
}
