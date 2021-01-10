package com.nibm201.onlineshop.Startup;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.nibm201.onlineshop.MainActivity;
import com.nibm201.onlineshop.R;
import com.nibm201.onlineshop.model.userAccountDetails;
import com.nibm201.onlineshop.service.ApiUtils;
import com.nibm201.onlineshop.service.userAccountService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginScreen extends AppCompatActivity {

    private Button loginButton;
    private TextView forgotPwd, createAccount;

    userAccountService accountService;
    List<userAccountDetails> userList = new ArrayList<userAccountDetails>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        //Hooks
        accountService = ApiUtils.getUserAccountService();
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
                getUserList();
                Intent intent = new Intent(LoginScreen.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void getUserList() {
        Call<List<userAccountDetails>> call = accountService.getAllUsers();
        call.enqueue(new Callback<List<userAccountDetails>>() {
            @Override
            public void onResponse(Call<List<userAccountDetails>> call, Response<List<userAccountDetails>> response) {
                if (response.isSuccessful()) {
                    userList = response.body();
                    System.out.println("***********");
                    System.out.println(userList.get(0).getEmail());
                    System.out.println(userList.get(1).getEmail());
                    System.out.println(userList.get(2).getEmail());
                    System.out.println(userList.get(3).getEmail());
                    System.out.println("***********");

                }
            }

            @Override
            public void onFailure(Call<List<userAccountDetails>> call, Throwable t) {
                Log.e("ERROR: ", t.getMessage());
            }
        });
    }
}