package DSAExcs;
import java.util.Scanner;
public class Airlines {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int type = 3;
        boolean seats [] = new boolean [11];
        seats [5] = true;
        
        int economyCounter = 0;
        int firstClassCounter = 0;
        
        while (type != 0){
            System.out.println("Please type 1 for First Class");
            System.out.println("Please type 2 for Economy");
            System.out.println("type 0 to exit");
            type = input.nextInt();
            
            if (type == 1){
                //NONE
                    if (economyCounter == 5 && firstClassCounter == 4){
                        System.out.println();
                        System.out.println("THERE ARE NO MORE AVAILABLE SEATS");
                        System.out.print("Next flight leaves in 3 hours.");
                        break;
                    }
                //AVAILABILITY================================
                    if (firstClassCounter == 4){
                        System.out.println();
                        System.out.println("Is it okay to seat on Economy class?");
                        System.out.println("Type 1 for yes");
                        System.out.println("Type 2 for no");
                        int economyAvailability = input.nextInt();
                        if (economyAvailability == 1){
                            System.out.println();
                            System.out.println("PLEASE SELECT 2; Economy Class");
                        }   else if (economyAvailability == 2){
                            System.out.print("Next flight leaves in 3 hours");
                        }
                    }
                    
                
                for (int i = 1; i <= 4; i++){
                    if (seats [i] == false){
                        seats [i] = true;
                        System.out.println();
                        System.out.println("You will be in seat " + i + " First Class");
                        System.out.println();
                        firstClassCounter++;
                        break;
                    } 
                }
            }   
            
            //=================2====================
            else if (type == 2){
                //NONE
                    if (economyCounter == 5 && firstClassCounter == 4){
                        System.out.println();
                        System.out.println("THERE ARE NO MORE SEATS AVAILABLE");
                        System.out.print("Next flight leaves in 3 hours.");
                        
                        break;
                       
                    }
                //AVAILABILITY================================
                    if (economyCounter == 5){
                        System.out.println();
                        System.out.println("Is it okay to seat on first class?");
                        System.out.println("Type 1 for yes");
                        System.out.println("Type 2 for no");
                        int economyAvailability = input.nextInt();
                        if (economyAvailability == 1){
                            System.out.println();
                            System.out.println("PLEASE SELECT 1; First Class");
                        }   else if (economyAvailability == 2){
                            System.out.println("Next flight leaves in 3 hours");
                        }
                    }
                    
                for (int i = 5; i <= 10; i++){
                    if (seats [i] == false){
                        seats [i] = true;
                        System.out.println();
                        System.out.println("You will be in seat " + i + " Economy Class");
                        System.out.println();
                        economyCounter++;
                        break;
                    }
                    
                    
                }
            }
        }
    }
    
}
