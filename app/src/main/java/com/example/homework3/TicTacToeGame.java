package com.example.homework3;

import java.util.Random;

public class TicTacToeGame {
    private char[] mBoard;
    private boolean playerWin = false;
    private boolean compWin = false;

    public TicTacToeGame(){
        mBoard = new char[9];
    }

    public void newGame(){
        for(int i =0; i < mBoard.length;i++){
            mBoard[i]= ' ';
        }
        playerWin = false;
        compWin = false;
    }
    public void setPlayerMove(int btnNum){
        mBoard[btnNum] = 'X';
    }
    public int getComputerMove(){
        Random ran = new Random();
        int n;
        do{
            n = ran.nextInt(9);

        }while (mBoard[n] != ' ');
        mBoard[n] = 'O';
        return n;

    }
    public int checkForWinner(){
        boolean isTie = true;
        if(mBoard[0] == 'X' && mBoard[1]=='X'&& mBoard[2]=='X'){
            playerWin = true;
            return 1;

        }
        else if(mBoard[0] == 'X' && mBoard[3]=='X'&& mBoard[6]=='X') {
            playerWin = true;
            return 1;
        }
        else if(mBoard[3] == 'X' && mBoard[4]=='X'&& mBoard[5]=='X'){
            playerWin = true;
            return 1;
        }
        else if(mBoard[6] == 'X' && mBoard[7]=='X'&& mBoard[8]=='X'){
            playerWin = true;
            return 1;
        }
        else if(mBoard[1] == 'X' && mBoard[4]=='X'&& mBoard[7]=='X'){
            playerWin = true;
            return 1;
        }
        else if(mBoard[2] == 'X' && mBoard[5]=='X'&& mBoard[8]=='X'){
            playerWin = true;
            return 1;
        }
        else if(mBoard[0] == 'X' && mBoard[4]=='X'&& mBoard[8]=='X'){
            playerWin = true;
            return 1;
        }
        else if(mBoard[2] == 'X' && mBoard[4]=='X'&& mBoard[6]=='X'){
            playerWin = true;
            return 1;
        }
        else if(mBoard[0] == 'O' && mBoard[1]=='O'&& mBoard[2]=='O'){
            compWin = true;
            return 1;

        }
        else if(mBoard[0] == 'O' && mBoard[3]=='O'&& mBoard[6]=='O') {
            compWin = true;
            return 1;
        }
        else if(mBoard[3] == 'O' && mBoard[4]=='O'&& mBoard[5]=='O'){
            compWin = true;
            return 1;
        }
        else if(mBoard[6] == 'O' && mBoard[7]=='O'&& mBoard[8]=='O'){
            compWin = true;
            return 1;
        }
        else if(mBoard[1] == 'O' && mBoard[4]=='O'&& mBoard[7]=='O'){
            compWin = true;
            return 1;
        }
        else if(mBoard[2] == 'O' && mBoard[5]=='O'&& mBoard[8]=='O'){
            compWin = true;
            return 1;
        }
        else if(mBoard[0] == 'O' && mBoard[4]=='O'&& mBoard[8]=='O'){
            compWin = true;
            return 1;
        }
        else if(mBoard[2] == 'O' && mBoard[4]=='O'&& mBoard[6]=='O'){
            compWin = true;
            return 1;
        }
        else{
            for(int i = 0; i <mBoard.length; i++){
                if(mBoard[i] == ' '){
                    isTie = false;
                }
            }
            if(isTie == true){
                return 2;
            }
            else{
                return 3;
            }
        }
    }
    public int whoWon(){
        if(playerWin == true){
            return 1;
        }
        else{
            return 2;
        }
    }




}
