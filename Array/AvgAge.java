package Array;

public class AvgAge {
    public static void main(String[] args) {
        int [] age = {15, 23, 21, 16, 27, 13, 17, 19};
        int sum = 0;

        for (int i : age){
            sum = sum + i;
        }

        int length = age.length;

        int avg = sum / length;

        System.out.println(avg);
    }
}
