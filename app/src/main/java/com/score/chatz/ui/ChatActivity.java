package com.score.chatz.ui;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.score.chatz.R;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        Intent intent = getIntent();
        String receiver = intent.getStringExtra("USER");

        FragmentManager fm = getSupportFragmentManager();
        ChatFragment mainFragment = (ChatFragment)fm.findFragmentById(R.id.container_main);

        if (mainFragment == null){
            mainFragment = ChatFragment.newInstance(receiver);
            fm.beginTransaction().add(R.id.container_main, mainFragment).commit();
        }
    }
}
