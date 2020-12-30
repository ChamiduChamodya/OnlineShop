package com.nibm201.onlineshop.Profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.nibm201.onlineshop.R;
import com.nibm201.onlineshop.customer.BuyNow;
import com.nibm201.onlineshop.customer.Payment;

public class ProfileEdit extends AppCompatActivity {

    private Spinner gender;
    private Button profile_edit_SaveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_edit);

        gender = findViewById(R.id.profile_edit_gender);
        String[] items = new String[]{"Male", "Female", "Not Specified"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        gender.setAdapter(adapter);

        profile_edit_SaveButton =findViewById(R.id.profile_edit_SaveButton);

        profile_edit_SaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}