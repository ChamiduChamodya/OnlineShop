package com.nibm201.onlineshop.Startup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.nibm201.onlineshop.MainActivity;
import com.nibm201.onlineshop.R;

public class LoginScreen extends AppCompatActivity {

    private Button loginButton;
    private TextView forgotPwd, createAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        //Hooks
        forgotPwd = findViewById(R.id.login_forgotPwd);
        createAccount = findViewById(R.id.login_createAccount);
        loginButton = findViewById(R.id.login_button);

        //Forgot password account Button click event
        forgotPwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginScreen.this, ForgotPassword.class);
                startActivity(intent);
            }
        });

        //Create account Button click event
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginScreen.this, CreateAccount.class);
                startActivity(intent);
            }
        });

        //Login Button click event
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(LoginScreen.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}