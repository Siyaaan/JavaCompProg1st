package Operator.LoopPractice;
import java.util.Scanner;


public class SumOfFirstN {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        Scanner inputCondition = new Scanner(System.in);
        String name = "";

        do {
            System.out.print("enter: ");
            int n = get.nextInt();
            int sum = 0;

            for(int num=1; num<=n; num++){
                sum += num;
            }

            System.out.println(sum);
            get.close();

            System.out.print("quit to exit: ");
            name = inputCondition.nextLine();
        } while (!name.equals("quit"));
    }
}
