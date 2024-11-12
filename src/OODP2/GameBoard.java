package OODP2;

import java.util.Scanner;

public class GameBoard {
    char[][] boardArray;
    boolean displayBoard = true;

    public GameBoard() {
        boardArray = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardArray[i][j] = '.';
            }
        }

    }
    public  void setSymbol(char symbol){

        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print("Enter row no. : ");
            int row = scan.nextInt();
            System.out.print("Enter col no. : ");
            int col = scan.nextInt();
            if ( (row < 0 || row > 2 ) || ( col < 0) || col > 2 )    {
                System.out.println("Invalid move");
            }
            else if ( boardArray[row][col] != '.' )
            {
                System.out.println("Invalid move");
            }
            else {
                boardArray[row][col] = symbol;
                break;
            }
        }

    }

    public void boardDisplay(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("      "+boardArray[i][j]);
            }
            System.out.println();
        }
    }


    public boolean checkWinner(char checkSymbol){
        return ( checkVertically(checkSymbol) || checkHorizontally(checkSymbol) || checkDiagonally(checkSymbol) );
    }

    public boolean checkHorizontally(char checkSymbol){
        for ( int i=0; i<3; i++ ){
            if(boardArray[i][0]==checkSymbol && boardArray[i][1]==checkSymbol && boardArray[i][2]==checkSymbol) return true;
        }
        return false;
    }
    public boolean checkDiagonally(char checkSymbol){

        if ( boardArray[0][0]==checkSymbol && boardArray[1][1]==checkSymbol && boardArray[2][2]==checkSymbol) return true;
        else if (boardArray[2][0]==checkSymbol && boardArray[1][1]==checkSymbol && boardArray[0][2]==checkSymbol) return true;
        else return false;
    }


    public boolean checkVertically(char checkSymbol){
        for ( int i=0; i<3; i++ ){
            if  ( boardArray[0][i]==checkSymbol && boardArray[1][i]==checkSymbol && boardArray[2][i]==checkSymbol  )  return true;
        }
        return false;
    }


}

