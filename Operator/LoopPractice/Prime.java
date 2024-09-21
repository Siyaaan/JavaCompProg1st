package Operator.LoopPractice;

public class Prime {
    public static void main(String[] args) {
        int start = 10;
        int end = 30;
        int prime = 0;

        for (int i = start; i <= end; i++){

                for (int a = 1; a <= i; a++){

                    double root = Math.sqrt(i);

                    prime = (int) root % a;
                        
                }      
        }
        System.out.println(prime);
    }
}
