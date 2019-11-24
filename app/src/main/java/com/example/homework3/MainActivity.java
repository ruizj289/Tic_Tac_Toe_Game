package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button[] mGameButtons = new Button[9];
    Button newGame;
    EditText mGameStatus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGameButtons[0] = (Button) findViewById(R.id.one);
        mGameButtons[1] = (Button) findViewById(R.id.two);
        mGameButtons[2] = (Button) findViewById(R.id.three);
        mGameButtons[3] = (Button) findViewById(R.id.four);
        mGameButtons[4] = (Button) findViewById(R.id.five);
        mGameButtons[5] = (Button) findViewById(R.id.six);
        mGameButtons[6] = (Button) findViewById(R.id.seven);
        mGameButtons[7] = (Button) findViewById(R.id.eight);
        mGameButtons[8] = (Button) findViewById(R.id.nine);
        newGame = (Button) findViewById(R.id.NewGame);
        mGameStatus = (EditText) findViewById(R.id.gameStatus);
        final TicTacToeGame mGame = new TicTacToeGame();
        mGame.newGame();


        mGameButtons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mGameButtons[0].getText() == "X"){
                    Toast. makeText(getApplicationContext(),"Illegal Move!",Toast. LENGTH_SHORT).show();

                }
                else if(mGameButtons[0].getText() == "O"){
                    Toast. makeText(getApplicationContext(),"Illegal Move!",Toast. LENGTH_SHORT).show();
                }
                else{
                    onPlayButtonClick(mGame, 0);
                }
            }
        });
        mGameButtons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mGameButtons[1].getText() == "X"){
                    Toast. makeText(getApplicationContext(),"Illegal Move!",Toast. LENGTH_SHORT).show();

                }
                else if(mGameButtons[1].getText() == "O"){
                    Toast. makeText(getApplicationContext(),"Illegal Move!",Toast. LENGTH_SHORT).show();
                }
                else{
                    onPlayButtonClick(mGame, 1);
                }
            }
        });
        mGameButtons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mGameButtons[2].getText() == "X"){
                    Toast. makeText(getApplicationContext(),"Illegal Move!",Toast. LENGTH_SHORT).show();

                }
                else if(mGameButtons[2].getText() == "O"){
                    Toast. makeText(getApplicationContext(),"Illegal Move!",Toast. LENGTH_SHORT).show();
                }
                else{
                    onPlayButtonClick(mGame, 2);
                }

            }
        });
        mGameButtons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mGameButtons[3].getText() == "X"){
                    Toast. makeText(getApplicationContext(),"Illegal Move!",Toast. LENGTH_SHORT).show();

                }
                else if(mGameButtons[3].getText() == "O"){
                    Toast. makeText(getApplicationContext(),"Illegal Move!",Toast. LENGTH_SHORT).show();
                }
                else{
                    onPlayButtonClick(mGame, 3);
                }

            }
        });
        mGameButtons[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mGameButtons[4].getText() == "X"){
                    Toast. makeText(getApplicationContext(),"Illegal Move!",Toast. LENGTH_SHORT).show();

                }
                else if(mGameButtons[4].getText() == "O"){
                    Toast. makeText(getApplicationContext(),"Illegal Move!",Toast. LENGTH_SHORT).show();
                }
                else{
                    onPlayButtonClick(mGame, 4);
                }

            }
        });
        mGameButtons[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mGameButtons[5].getText() == "X"){
                    Toast. makeText(getApplicationContext(),"Illegal Move!",Toast. LENGTH_SHORT).show();

                }
                else if(mGameButtons[5].getText() == "O"){
                    Toast. makeText(getApplicationContext(),"Illegal Move!",Toast. LENGTH_SHORT).show();
                }
                else{
                    onPlayButtonClick(mGame, 5);
                }

            }
        });
        mGameButtons[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mGameButtons[6].getText() == "X"){
                    Toast. makeText(getApplicationContext(),"Illegal Move!",Toast. LENGTH_SHORT).show();

                }
                else if(mGameButtons[6].getText() == "O"){
                    Toast. makeText(getApplicationContext(),"Illegal Move!",Toast. LENGTH_SHORT).show();
                }
                else{
                    onPlayButtonClick(mGame, 6);
                }

            }
        });
        mGameButtons[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mGameButtons[7].getText() == "X"){
                    Toast. makeText(getApplicationContext(),"Illegal Move!",Toast. LENGTH_SHORT).show();

                }
                else if(mGameButtons[7].getText() == "O"){
                    Toast. makeText(getApplicationContext(),"Illegal Move!",Toast. LENGTH_SHORT).show();
                }
                else{
                    onPlayButtonClick(mGame, 7);
                }

            }
        });
        mGameButtons[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mGameButtons[8].getText() == "X"){
                    Toast. makeText(getApplicationContext(),"Illegal Move!",Toast. LENGTH_SHORT).show();
                }
                else if(mGameButtons[8].getText() == "O"){
                    Toast. makeText(getApplicationContext(),"Illegal Move!",Toast. LENGTH_SHORT).show();
                }
                else{
                    onPlayButtonClick(mGame, 8);
                }

            }
        });
        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNewGameButtonClick(mGame);
            }
        });



    }
    public void onPlayButtonClick(TicTacToeGame mGame, int btnNum){
        int status;
        int red = Color.parseColor("#FF0000");
        mGame.setPlayerMove(btnNum);
        mGameButtons[btnNum].setText("X");
        mGameButtons[btnNum].setTextColor(red);
        status = isGameOver(mGame);
        if(status == 2){
            getComputerMove(mGame);
            status = isGameOver(mGame);
            if(status == 1){
                Toast. makeText(getApplicationContext(),"New Game?",Toast. LENGTH_SHORT).show();
            }
        }
        if(status == 1){
            Toast. makeText(getApplicationContext(),"New Game?",Toast. LENGTH_SHORT).show();
        }
    }
    public int isGameOver(TicTacToeGame mGame){
        int status = mGame.checkForWinner();
        if(status == 1){
            int winner = mGame.whoWon();
            if(winner == 1){
                mGameStatus.setText("Player Wins!");
                return 1;
            }
            else{
                mGameStatus.setText("Comp Wins!");
                return 1;
            }

        }
        else if(status == 2){
            mGameStatus.setText("Tie!");
            return 1;
        }
        else{
            return 2;
        }
    }
    public void getComputerMove(TicTacToeGame mGame){
        int btnNum = mGame.getComputerMove();
        int blue = Color.parseColor("#0000FF");
        mGameButtons[btnNum].setText("O");
        mGameButtons[btnNum].setTextColor(blue);
    }
    public void onNewGameButtonClick(TicTacToeGame mGame){
        mGame.newGame();
        mGameButtons[0].setText("");
        mGameButtons[1].setText("");
        mGameButtons[2].setText("");
        mGameButtons[3].setText("");
        mGameButtons[4].setText("");
        mGameButtons[5].setText("");
        mGameButtons[6].setText("");
        mGameButtons[7].setText("");
        mGameButtons[8].setText("");
        mGameStatus.setText("Game Status");
    }
}


