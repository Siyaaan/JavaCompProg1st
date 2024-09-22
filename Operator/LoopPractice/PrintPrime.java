package Operator.LoopPractice;

import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
		System.out.println("Enter the number :");

		int end = 10;
        
        for (int i = 1; i <= end; i++)
        {
            for (int a = 2; a <= i; a++)
            {
                if (i % a == 0)
                {
                    break;
                }
            }
            
        }
    

		/*if(count==0)
			System.out.println("This is a Prime startber.");
		else
			System.out.println("This is not a Prime startber.");
            */
        input.close();
    }
}
