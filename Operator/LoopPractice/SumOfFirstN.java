package Operator.LoopPractice;
import java.util.Scanner;


public class SumOfFirstN {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("enter: ");
        int n = get.nextInt();
        int sum = 0;

        for(int num=1; num<=n; num++){
            sum += num;
        }

        System.out.print(sum);
        get.close();
    }
}
