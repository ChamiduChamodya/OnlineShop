package com.nibm201.onlineshop.Startup;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;
import com.nibm201.onlineshop.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ForgotPassword extends AppCompatActivity {

    private CircleImageView backButton;
    private TextInputLayout forgotPwd_email, forgotPwd_verifyCode,
            forgotPwd_NewPwd, forgotPwd_NewPwdConfirm;
    private Button sendCode, verify, createPwd;
    private TextView resendTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        //Hooks
        backButton = (CircleImageView) findViewById(R.id.forgotPwd_back);
        forgotPwd_email = (TextInputLayout) findViewById(R.id.forgotPwd_email);
        sendCode = (Button) findViewById(R.id.forgotPwd_sendButton);
        resendTime = (TextView) findViewById(R.id.forgotPwd_resendTime);
        forgotPwd_verifyCode = (TextInputLayout) findViewById(R.id.forgotPwd_verifyCode);
        verify = (Button) findViewById(R.id.forgotPwd_verifyButton);
        forgotPwd_NewPwd = (TextInputLayout) findViewById(R.id.forgotPwd_NewPwd);
        forgotPwd_NewPwdConfirm = (TextInputLayout) findViewById(R.id.forgotPwd_NewPwdConfirm);
        createPwd = (Button) findViewById(R.id.forgotPwd_CreateNewPasswordButton);

        //Hide Components
        HideComponent();

        //Back Button Click Event
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Hide Components
                HideComponent();
                finish();
            }
        });

        //Send Code Button Click Event
        sendCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Hide Components
                forgotPwd_email.setEnabled(false);
                sendCode.setEnabled(false);
                //Show Components
                resendTime.setVisibility(View.VISIBLE);
                forgotPwd_verifyCode.setVisibility(View.VISIBLE);
                verify.setVisibility(View.VISIBLE);
            }
        });

        //Verification Code Check Button Click Event
        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Hide Components
                resendTime.setVisibility(View.INVISIBLE);
                forgotPwd_verifyCode.setEnabled(false);
                verify.setEnabled(false);
                //Show Components
                forgotPwd_NewPwd.setVisibility(View.VISIBLE);
                forgotPwd_NewPwdConfirm.setVisibility(View.VISIBLE);
                createPwd.setVisibility(View.VISIBLE);
            }
        });

        //Create password Button Click Event
        createPwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public void onBackPressed() {

        //Hide Components
        HideComponent();
        super.onBackPressed();
    }

    //Hide Components
    private void HideComponent(){
        resendTime.setVisibility(View.INVISIBLE);
        forgotPwd_verifyCode.setVisibility(View.INVISIBLE);
        verify.setVisibility(View.INVISIBLE);
        forgotPwd_NewPwd.setVisibility(View.INVISIBLE);
        forgotPwd_NewPwdConfirm.setVisibility(View.INVISIBLE);
        createPwd.setVisibility(View.INVISIBLE);
    }
}