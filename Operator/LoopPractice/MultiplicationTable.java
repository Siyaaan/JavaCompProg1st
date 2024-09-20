package Operator.LoopPractice;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int num = get.nextInt();

        for (int i=10; i>=1; i--){//to reverse this to normal; switch the number of initialization and condition and make the condition less than the number. Make the update positive after
            int product = i * num;

            System.out.println(num + " x " + i + " = " + product);
        }

        get.close();

    }
}
