package com.nibm201.onlineshop.customer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.nibm201.onlineshop.R;

public class ViewCart extends AppCompatActivity {

    private Button viewCart_BuyNow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_cart);

        //Hooks
        viewCart_BuyNow = findViewById(R.id.viewCart_BuyNow);

        viewCart_BuyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewCart.this, BuyNow.class);
                startActivity(intent);
            }
        });
    }
}