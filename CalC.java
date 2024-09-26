import java.util.Scanner;

public class CalC {

//DECIMAL PLACES CONVERSION -------------------------------------------------------
    static void decimal (){
        Scanner inputDecimalConversion = new Scanner(System.in);

        System.out.println("Enter a Decimal Value: ");
        int decimalNum = inputDecimalConversion.nextInt();
        
        //DECIMAL -----> BINARY
        int decimalBinary = decimalNum;
        String binary = "";

        //EQUATION
        while (decimalBinary > 0){
            int remainderBinary = decimalBinary % 2;
            binary = remainderBinary + binary;
            
            decimalBinary = decimalBinary / 2;
        }
        System.out.println("Binary is: " + binary);
        inputDecimalConversion.close();



        //DECIMAL -----> OCTADECIMAL
        int decimalOcta = decimalNum;
        String Octadecimal = "";

        //Equation
        while (decimalOcta > 0){
            int remainderHexa = decimalOcta % 8;
            Octadecimal =   remainderHexa + Octadecimal;
            
            decimalOcta = decimalOcta / 8;
        }
        System.out.println("OctaDecimal is: " + Octadecimal);

        

        //DECIMAL -----> HexaDecimal
        int decimalHexa = decimalNum;
        String HexaDecimal = "";

        //Equation
        while (decimalHexa > 0){
            int remainderHexa = decimalHexa % 16;

            switch (remainderHexa) {
                case 10:
                    HexaDecimal = 'A' + HexaDecimal;
                    break;
                case 11:
                    HexaDecimal = 'B' + HexaDecimal;
                    break;
                case 12:
                    HexaDecimal = 'C' + HexaDecimal;
                    break;
                case 13:
                    HexaDecimal = 'D' + HexaDecimal;
                    break;
                case 14:
                    HexaDecimal = 'E' + HexaDecimal;
                    break;
                case 15:
                    HexaDecimal = 'F' + HexaDecimal;
                    break;

                default:
                    HexaDecimal = remainderHexa + HexaDecimal;
                    break;
            }
            
            decimalHexa = decimalHexa / 16;
        }
        System.out.println("HexaDecimal is: " + HexaDecimal);
        inputDecimalConversion.close();
    }

//BINARY DIGIT CONVERSION to DECIMAL -------------------------------------------------------
    static void binary (){
        Scanner inputBinaryConverstion = new Scanner(System.in);

        int binary = inputBinaryConverstion.nextInt();
        int result = 0;
        int exponent = 0;


        while (binary > 0){
            int hold = binary % 10;
            int current = (int) Math.pow(2, exponent);
            
            int currentMultiplier = current * hold;
            result = currentMultiplier + result;

            binary = binary / 10;
            exponent++;
        }
        System.out.println(result);
        inputBinaryConverstion.close();
    }


//OCTADECIMAL DIGIT CONVERSION to DECIMAL -------------------------------------------------------
    static void OctaDecimal (){
        Scanner inputBinaryConverstion = new Scanner(System.in);

        int binary = inputBinaryConverstion.nextInt();
        int result = 0;
        int exponent = 0;


        while (binary > 0){
            int hold = binary % 10;
            int current = (int) Math.pow(8, exponent);
            
            int currentMultiplier = current * hold;
            result = currentMultiplier + result;

            binary = binary / 10;
            exponent++;
        }
        System.out.println(result);
        inputBinaryConverstion.close();
    }

//HEXADECIMAL DIGIT CONVERSION to DECIMAL -------------------------------------------------------
    static void HexaDecimal (){
        Scanner inputBinaryConverstion = new Scanner(System.in);

        int binary = inputBinaryConverstion.nextInt();
        int result = 0;
        int exponent = 0;


        while (binary > 0 /*&& binary <= 1*/){
            int hold = binary % 10;
            int current = (int) Math.pow(16, exponent);
            
            int currentMultiplier = current * hold;
            result = currentMultiplier + result;

            binary = binary / 10;
            exponent++;
        }
        System.out.println(result);
        inputBinaryConverstion.close();
    }



        
    //-------------------------> MAIN--------------------------
    
    public static void main (String [] args){ 
        Scanner get = new Scanner(System.in);

        System.out.print("Enter your preference: ");
        int num = get.nextInt();
        
        switch (num) {
            case 1:
                HexaDecimal();
                break;

            case 2:
                decimal ();
                break;

            case 3:
                binary();
                break;

            case 4:
                OctaDecimal();;
                break;

        }
        get.close();
    }
}
