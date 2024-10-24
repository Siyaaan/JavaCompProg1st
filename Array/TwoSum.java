package Array;

public class TwoSum {
    public static void main(String[] args) {
        int num [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int entered = 14;
        

        outerloop:
        for (int i:num){
            for (int j:num){
                int sum = i + j;
                if (sum == entered){
                    System.out.println(i + " + " + j);
                    break outerloop;
                }   
            }
        }   

    }    
}
