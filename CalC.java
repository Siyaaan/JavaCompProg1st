import java.util.Scanner;

public class CalC {

    static void addition (){
        Scanner inputAdd = new Scanner(System.in);
        System.out.println("Enter a Value: ");
        int num1 = inputAdd.nextInt();
        int num2 = inputAdd.nextInt();

        int sum = num1 + num2;
        System.out.println("Your answer is: " + sum);

        inputAdd.close();
    }

    static void decimal (){
        Scanner inputDecimal = new Scanner(System.in);

        System.out.println("Enter a Decimal Value: ");
        int decimal = 100;//inputDecimal.nextInt();
        String binary = "";

        //Decimal to binary
        while (decimal > 0){
            int remainder = decimal % 2;
            binary = binary + remainder;
            

            decimal = decimal / 2;
            
        }
        inputDecimal.close();
    }
    public static void main (String [] args){ 
        Scanner get = new Scanner(System.in);

        System.out.print("Enter your preference: ");
        int num = get.nextInt();
        
        switch (num) {
            case 1:
                addition();
                break;

            case 2:
                decimal();
                break;

            case 3:
                System.out.println("third");
                break;

            case 4:
                System.out.println("fourth");
                break;

        }
        get.close();
    }
}