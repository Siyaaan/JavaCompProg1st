import java.util.Scanner;


public class CalC {

//DECIMAL PLACES CONVERSION -------------------------------------------------------
    static void decimal (){
        Scanner inputDecimalConversion = new Scanner(System.in);

        System.out.print("Enter a Decimal Value: ");
        int decimalNum = inputDecimalConversion.nextInt();
        
        //DECIMAL -----> BINARY
        int decimalBinary = decimalNum;
        String binary = "";

        System.out.println("--------------------");
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
            int remainderOcta = decimalOcta % 8;
            Octadecimal =   remainderOcta + Octadecimal;
            
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

        System.out.print("Enter a Binary: ");
        int binary = inputBinaryConverstion.nextInt();
        int decimal = 0;
        int exponent = 0;

        System.out.println("--------------------");
        while (binary > 0){
            int hold = binary % 10;
            int current = (int) Math.pow(2, exponent);
            
            int currentMultiplier = current * hold;
            decimal = currentMultiplier + decimal;

            binary = binary / 10;
            exponent++;
        }
        System.out.println("Decimal is: " + decimal);
        inputBinaryConverstion.close();

    //Binary to Decimal to OctaDecimal
        int octaDecimal = decimal;
        String result = "";

        while (octaDecimal > 0){
            int remainderOcta = octaDecimal% 8;
            result = remainderOcta + result;
            octaDecimal = octaDecimal / 8;
        }
        System.out.println("OctaDecimal is: " + result);

    //Binary to Decimal to HexaDecimal
        int hexaDecimal = decimal;
        String hexaResult = "";

        while (hexaDecimal > 0){
            int remainderHexa = hexaDecimal % 16;
            hexaDecimal = hexaDecimal / 16;

            switch (remainderHexa) {
                case 10:
                    hexaResult = "A" + hexaResult;
                    break;
                
                case 11:
                    hexaResult = "B" + hexaResult;  
                    break;
            
                case 12:
                    hexaResult = "c" + hexaResult;
                    break;

                case 13:
                    hexaResult = "D" + hexaResult;
                    break;

                case 14:
                    hexaResult = "E" + hexaResult;
                    break;

                case 15:
                    hexaResult = "F" + hexaResult;
                    break;

                default:
                    hexaResult = remainderHexa + hexaResult;
                    break;
            }
            
        }
        System.out.println("hexaDecimal: " + hexaResult);
    }


//OCTADECIMAL DIGIT CONVERSION to DECIMAL -------------------------------------------------------
    static void OctaDecimal (){
        Scanner inputOctaConverstion = new Scanner(System.in);

        System.out.print("Enter a OctaDecimal Value: ");
        int Octa = inputOctaConverstion.nextInt();
        int decimal = 0;
        int exponent = 0;

        while (Octa > 0){
            int hold = Octa % 10;
            int current = (int) Math.pow(8, exponent);
            
            int currentMultiplier = current * hold;
            decimal = currentMultiplier + decimal;

            Octa = Octa / 10;
            exponent++;
        }
        System.out.println("Decimal is: " + decimal);

        //Octa to Decimal to Binary

        String OctaToBinary = ""; //this became string because we need to concatenate only the remainder. other wise, it will just print the total
        int decimalConverterBinary = decimal; 
        while (decimalConverterBinary > 0){
            int remainder= decimalConverterBinary % 2;
            OctaToBinary = remainder + OctaToBinary;
            decimalConverterBinary = decimalConverterBinary / 2;
        }
        System.out.println("Binary is: " + OctaToBinary);

        // Octa to Decimal to HexaDecimal
        
        int decimalConverterHexaDecimal = decimal;
        String octaToHexa = "";

        while (decimalConverterHexaDecimal > 0){
            int hexaRemainder = decimalConverterHexaDecimal % 16;
            decimalConverterHexaDecimal = decimalConverterHexaDecimal / 16;

            switch (hexaRemainder) {
                case 10:
                    octaToHexa = "A" + octaToHexa;
                    break;
                    
                case 11:
                    octaToHexa = "B" + octaToHexa;
                    break;

                case 12:
                    octaToHexa = "C" + octaToHexa;
                    break;

                case 13:
                    octaToHexa = "D" + octaToHexa;
                    break;

                case 14:
                    octaToHexa = "E" + octaToHexa;
                    break;

                case 15:
                    octaToHexa = "F" + octaToHexa;
                    break;

                default:
                    octaToHexa = hexaRemainder + octaToHexa;
                    break;
            }
            
        }
        System.out.println("HexaDecimal is: " + octaToHexa);
        inputOctaConverstion.close();
    }

//HEXADECIMAL DIGIT CONVERSION to DECIMAL -------------------------------------------------------
    static void HexaDecimal (){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a HexaDecimal: ");
        String name = input.nextLine().toUpperCase();

        int length = name.length();

        String switchCase = "";

        for (int i = 0; length > i; i++){
            char letters = name.charAt(i);
            
            switch (letters) {

                case 'A':
                    switchCase = switchCase + "10";
                    break;

                case 'B':
                    switchCase = switchCase + "11";
                    break;

                case 'C':
                    switchCase = switchCase + "12";
                    break;

                case 'D':
                    switchCase = switchCase + "13";
                    break;

                case 'E':
                    switchCase = switchCase + "14";
                    break;

                case 'F':
                    switchCase = switchCase + "15";
                    break;
            
                default:
                    switchCase = switchCase + letters;
                    break;
            }
        }

        int numConverted = Integer.parseInt(switchCase);;
        int decimal = 0;
        int exponent = 0;

        while (numConverted > 0){
            int let = numConverted % 100;
            
            if (10 <= let && let <= 15){
                int hold = (int)Math.pow(16, exponent);
                int remHexa = hold * let;
                decimal = decimal + remHexa;
                numConverted = numConverted / 100;

            } else {
                int letElse = numConverted % 10;
                int hold = (int)Math.pow(16, exponent);
                int remHexa = hold * letElse;
                decimal = decimal + remHexa;
                numConverted = numConverted / 10;
            }
            exponent++;
        }

        System.out.println("Decimal: " + decimal);

        //HexaDecimal to Decimal to Binary

        int hexaDecimalToDecimalToBinary = decimal;
        String binary = "";

        while (hexaDecimalToDecimalToBinary > 0){
            int remainder = hexaDecimalToDecimalToBinary % 2;
            binary = remainder + binary;
            hexaDecimalToDecimalToBinary = hexaDecimalToDecimalToBinary / 2;
        }

        System.out.println("Binary: " + binary);

        //HexaDecimal to Decimal to OctaDecimal

        int hexaDecimalToDecimalToOcta = decimal;
        String octaDecimal = "";

        while (hexaDecimalToDecimalToOcta > 0){
            int remainderOcta = hexaDecimalToDecimalToOcta % 8;
            octaDecimal = remainderOcta + octaDecimal;
            hexaDecimalToDecimalToOcta = hexaDecimalToDecimalToOcta / 8;
        }

        System.out.println("Octa Decimal: " + octaDecimal);

        input.close();
    }
        
    //-------------------------> MAIN--------------------------
    
    public static void main (String [] args){ 
        Scanner get = new Scanner(System.in);
        int num = 0;
        
        System.out.println("Enter your preference: ");
        System.out.println("Press \"1\" for Decimal ");
        System.out.println("Press \"2\" for Binary ");
        System.out.println("Press \"3\" for OctaDecimal ");
        System.out.println("Press \"4\" for HexaDecimal ");

        do{
        System.out.print("Enter your preference: ");
        num = get.nextInt();
        
        switch (num) {
            case 1:
                decimal();
                break;

            case 2:
                binary();
                break;

            case 3:
                OctaDecimal();
                break;

            case 4:
                HexaDecimal();
                break;

        }
        } while (num != 0);
        get.close();
    }
}
