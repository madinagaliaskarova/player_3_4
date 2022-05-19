package com.geektech.player_3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.geektech.player_3_4.second.SecondFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container_one, new FirstFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container_two, new SecondFragment()).commit();
    }
}