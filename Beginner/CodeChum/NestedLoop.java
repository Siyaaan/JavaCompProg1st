package CodeChum;

import java.util.Scanner;

public class NestedLoop{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Size: ");
        int size = input.nextInt();
        

        for (int i = 1; i <= size; i++){
            for (int k = i; k < size; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        input.close();
    }
}