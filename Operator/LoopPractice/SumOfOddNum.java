package Operator.LoopPractice;
import java.util.Scanner;

public class SumOfOddNum {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        int odd = get.nextInt();
        int num = 0;
        int oddNum = 1;

        for (int i = 1; i <= odd; i++) {
            num = num + oddNum;
            oddNum = oddNum + 2;

                     
        }
        System.out.println(num);
       
        get.close();
        
    }
}
