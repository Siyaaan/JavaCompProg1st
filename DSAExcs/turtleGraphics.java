import java.util.Scanner;

public class turtleGraphics {
  public static void main (String[]args){
    Scanner input = new Scanner(System.in);

    int x = 20;
    int y = 20;
    int row = 0;
    int col = 0;

    int [][] grid = new int [x][y];

    for (int i = 0; i < x; i++){
      for (int j = 0; j < y; j++){
        grid [i][j] = 0;
        System.out.print(grid [i][j] + " ");
      }
      System.out.println();
    }

    
    int turn = 0;
    int spaces = 0;
    boolean penMod = false;
    int sentinel = 0;
    
    while (sentinel != 9){
      System.out.println("1 : Pen Up");
      System.out.println("2 : Pend Down");
      System.out.println("3 : Turn Right");
      System.out.println("4 : Turn Left");
      System.out.println("5, * : Move Forward * Spaces");
      System.out.println("6 : Display the 20-by-20 array");
      System.out.println("9 : Exit");
      System.out.print("INPUT HERE:::");
      sentinel = input.nextInt();
      System.out.println();

      switch(sentinel){
        case 1:
          penMod = false;
          break;
        case 2:
          penMod = true;
          break;
        case 3:
          if (turn == 4){
            turn = 0;
          } else {
            turn++;
          }
          break;
        case 4:
          if (turn == -1){
            turn = 3;
          } else {
            turn--;
          }
          break;
        case 5:
          spaces = input.nextInt();

          for (int i = 0; i < spaces; i++){
            if (penMod == false){
              switch(turn){
                case 0:
                  grid[row][col] = 0;
                  col++;
                  break;
                case 1:
                  grid[row][col] = 0;
                  row++;
                  break;
                case 2:
                  grid[row][col] = 0;
                  col--;
                  break;
                case 3:
                  grid[row][col] = 0;
                  row--;
                  break;
              }
            }

            if (penMod == true){
              switch(turn){
                case 0:
                  grid[row][col] = 1;
                  col++;
                  break;
                case 1:
                  grid[row][col] = 1;
                  row++;
                  break;
                case 2:
                  grid[row][col] = 1;
                  col--;
                  break;
                case 3:
                  grid[row][col] = 1;
                  row--;
                  break;
              }
            }
          }
          break;

        case 6:
          for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
              System.out.print(grid[i][j] + " ");
            }
            System.out.println();
          }
          break;

        case 9:
          System.out.print("Exiting the Program...");
          break;
      }
    }
  }
}
