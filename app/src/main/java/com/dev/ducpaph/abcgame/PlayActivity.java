package com.dev.ducpaph.abcgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
    }

    public void pause(View view) {
        Intent intent = new Intent(PlayActivity.this,PauseActivity.class);
        startActivity(intent);
    }
}
