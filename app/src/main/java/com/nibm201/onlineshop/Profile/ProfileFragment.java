package com.nibm201.onlineshop.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.nibm201.onlineshop.R;
import com.nibm201.onlineshop.customer.BuyNow;
import com.nibm201.onlineshop.customer.Payment;
import com.nibm201.onlineshop.customer.ViewCart;

public class ProfileFragment extends Fragment {

    private Button profileEditButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();

        return inflater.inflate(R.layout.fragment_profile,container,false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        //Your Code Here
        //

        //Hooks
        profileEditButton = (Button) getView().findViewById(R.id.profileEditButton);

        profileEditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ProfileEdit.class);
                startActivity(intent);
            }
        });

    }
}
