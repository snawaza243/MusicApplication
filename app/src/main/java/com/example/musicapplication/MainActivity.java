package com.example.musicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        music = MediaPlayer.create(this,R.raw.sound);
    }


    public void next(View view) {
        Intent intent = new Intent(MainActivity.this, NextActivity.class);
        startActivity(intent);
    }
    public void musicPlay(View view) {
//        Intent intent = new Intent(getApplicationContext(), AudioService.class);
//        startService(intent);
        music.start();
        Toast.makeText(getApplicationContext(), "Music is Playing", Toast.LENGTH_SHORT).show();
    }
    public void musicStop(View view) {
//        Intent intent = new Intent(getApplicationContext(), AudioService.class);
//        stopService(intent);
        music.stop();
        Toast.makeText(getApplicationContext(), "Music is Stopped", Toast.LENGTH_SHORT).show();
    }

    public void musicPause(View v){
        music.pause();
        music = MediaPlayer.create(this, R.raw.sound);
        Toast.makeText(getApplicationContext(), "Music is paused", Toast.LENGTH_SHORT).show();
    }
}