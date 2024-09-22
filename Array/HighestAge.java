package Array;

public class HighestAge {
    public static void main(String[] args) {
        int [] age = {15, 23, 21, 16, 27, 13, 17, 19};
        //int sum = 0;

        //int length = age.length;

        int highest = age [0];

        for (int i : age){
            if (highest < i){
                highest = i;
            }
        }

        System.out.println(highest);
    }
}
