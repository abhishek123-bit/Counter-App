package com.example.mycounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mycounter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding b;
    int qty=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        eventHandler();
    }


    private void eventHandler() {
        b.decBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseQuantity();
            }
        });

        b.incBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseQuantity();
            }
        });
    }

    //To increase the quantity
    private void increaseQuantity() {
        b.qty.setText(++qty+"");
    }

    //To decrease the quantity
    private void decreaseQuantity() {

        if(qty==0){
            Toast.makeText(this, "Quantity is already 0", Toast.LENGTH_SHORT).show();
            return;
        }

        b.qty.setText(--qty+"");
    }



}