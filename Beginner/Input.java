import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new
        Scanner(System.in);
            
            System.out.println("Number of Days: "); 

            int data = input.nextInt();
            
            int qoutient = data / 7;
            int remain = data - (7 * qoutient);

            System.out.println("Total Week: " + qoutient);
            System.out.println("Total Days: " + remain);

        input.close();

    }
}
