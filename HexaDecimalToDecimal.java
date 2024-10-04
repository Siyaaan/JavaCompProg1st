import java.util.Scanner;

public class HexaDecimalToDecimal {

    static void HexaDecimal() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hexNumber = input.nextLine().toUpperCase(); // Convert input to uppercase to handle both lowercase and uppercase letters
        
        int decimal = 0;  // Resulting decimal value
        int length = hexNumber.length();  // Length of the input string

        // Loop through each character in the hexadecimal string
        for (int i = 0; i < length; i++) {
            char hexChar = hexNumber.charAt(i);  // Get the current character
            int hexValue;

            // Convert the current character to its decimal equivalent
            if (hexChar >= '0' && hexChar <= '9') {
                hexValue = hexChar - '0';  // For '0' to '9'
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                hexValue = hexChar - 'A' + 10;  // For 'A' to 'F'
            } else {
                System.out.println("Invalid hexadecimal character: " + hexChar);
                return;
            }

            // Update the decimal value based on the position
            decimal = decimal * 16 + hexValue;
        }

        System.out.println("Decimal value: " + decimal);
        input.close();
    }

    public static void main(String[] args) {
        HexaDecimal();
    }
}
