package com.nibm201.onlineshop.customer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nibm201.onlineshop.R;

public class BuyNow extends AppCompatActivity {

    private Button BuyNow_Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_now);

        //Hooks
        BuyNow_Button = findViewById(R.id.BuyNow_Button);

        BuyNow_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuyNow.this, Payment.class);
                startActivity(intent);
            }
        });
    }
}