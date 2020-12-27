package com.nibm201.onlineshop.Startup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.nibm201.onlineshop.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class CreateAccount extends AppCompatActivity {

    CircleImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        //Hooks
        backButton = findViewById(R.id.createAccount_back);

        //Back Button Click Event
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}