package OODP2;


import java.util.Scanner;


    public class Game {


        OODP2.Player player1 = new OODP2.Player("Sayem", 'X');
        OODP2.Player player2 = new OODP2.Player("Sifat", 'O');
        OODP2.GameBoard board = new OODP2.GameBoard();



        boolean move = true;


        public void start(){
            System.out.println("Hello Player: "+player1.playerName+ " & Player : "+player2.playerName);
            board.boardDisplay();


            Scanner scan = new Scanner(System.in);
            int count = 1;
            while(count < 20) {



                if (move) {
                    // board.boardArray[i][j] = player1.symbolForPlayer;
                    board.setSymbol(player1.symbolForPlayer);
                    board.boardDisplay();
                    if(board.checkWinner(player1.symbolForPlayer)) {
                        System.out.println( player1.playerName+" you have won the game ! ! !");
                        break;
                    }
                    else move=false;
                    move=false;
                }



                else {
                    board.setSymbol(player2.symbolForPlayer);
                    board.boardDisplay();
                    if(board.checkWinner(player2.symbolForPlayer)) {
                        System.out.println( player2.playerName+" you have won the game ! ! !");
                        break;
                    }
                    else move=true;
                    move = true;
                }
                count++;
            }


        }


    }