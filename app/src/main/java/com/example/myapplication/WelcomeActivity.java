package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.ui.login.LoginActivity;


public class WelcomeActivity extends AppCompatActivity {

    private Button mButtonLetsGo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        //Create the first activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare all elements with interaction in activity_main layout
        mButtonLetsGo = (Button) findViewById(R.id.activity_main_button);

        mButtonLetsGo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //User click on Let's go button
                Intent loginActivityIntent = new Intent(WelcomeActivity.this, LoginActivity.class);
                startActivity(loginActivityIntent);
            }
        });
    }
}
