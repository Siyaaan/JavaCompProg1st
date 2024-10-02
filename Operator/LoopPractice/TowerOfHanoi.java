package Operator.LoopPractice;
import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("number of sequence: ");
        int numOfSeq = input.nextInt();
        

        for (int i = 1; i <=numOfSeq; i ++){
            int hold = (int) Math.pow(2, i);
            int result = hold - 1;
            System.out.println(result);
        }
        
        input.close();
    }
    
}
