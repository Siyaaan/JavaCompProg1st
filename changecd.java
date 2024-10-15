import java.util.Scanner;

public class changecd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a file location: ");
        String file = input.nextLine();

        int length = file.length();

        System.out.println(length);

        String switchCase = "";

        for (int i = 0; i < length; i++){
            char letters = file.charAt(i);

            switch (letters) {
                case '\\':
                    switchCase =  switchCase + '/';
                    break;

                case ':':
                    switchCase = "" + switchCase;
                    break;

                default:
                    switchCase = switchCase + letters;
                    break;
            }
        }
        System.out.print("/" + switchCase);
        input.close();
    }
}
