package Operator.LoopPractice;

import java.util.Scanner;

public class ProductOfFirstEvenN {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("enter: ");
        int n = get.nextInt();
        int sum = 0;
        int evenNumber = 2;

        for(int num=1; num<=n; ++num ){
            sum += evenNumber;  //sum = 0 + 2 = 2 ---> Prints the result
            evenNumber += 2;    // evenNum = 2 + 2 = 4 ---> Update the process

                                //sum = 2 + 4 = 6
                                //evenNum = 4 + 2 = 6

                                //sum = 6 + 6 = 12
                                //evenNum = 6 + 2 = 8

                                //sum = 12 + 8 = 20
                                //evenNumber = 8 + 2 = 10

                                //sum = 20 + 10 = 30
                                //evenNumber = 10 + 2 = 12
        }

        System.out.print(Math.abs(sum));
        get.close();
    }
}
