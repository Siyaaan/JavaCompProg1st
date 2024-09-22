package Array;

public class SumOfArray {
    public static void main(String[] args) {
        int [] age = {15, 23, 21, 16, 27, 13, 17, 19};
        int sum = 0;

        //int length = age.length;

        //int highest = age [0];

        for (int i : age){
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
