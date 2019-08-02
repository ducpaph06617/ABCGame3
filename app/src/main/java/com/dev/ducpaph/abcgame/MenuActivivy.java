package com.dev.ducpaph.abcgame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;

public class MenuActivivy extends AppCompatActivity {

    private Button btnStart;
    private Button btnHighScore;
    private Button btnOutGame;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_activivy);

        initView();
        quitGame();


    }
    public void initView(){
        btnStart = (Button) findViewById(R.id.btnStart);
        btnHighScore = (Button) findViewById(R.id.btnHighScore);
        btnOutGame = (Button) findViewById(R.id.btnOutGame);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivivy.this,NameActivity.class);
                startActivity(intent);
            }
        });
    }
    public void quitGame(){
        btnOutGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MenuActivivy.this);

                builder.setTitle("Thoát Game");
                builder.setMessage("Bạn có muốn thoát game?");
                builder.setCancelable(false);
                builder.setPositiveButton("Hủy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.setNegativeButton("Xác Nhận", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        System.exit(0);
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }
}
