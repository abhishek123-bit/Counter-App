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
        // Initializing the binding
        b=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        //Handel click events
        eventHandler();
    }

    /**
     * Trigger Event handlers to listen the actions
     */
    private void eventHandler() {
        //click listener on Decrease button
        b.decBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //To decrease quantity
                decreaseQuantity();
            }
        });

        //click listener on Increase button
        b.incBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //To increase quantity
                increaseQuantity();
            }
        });
    }

    /**
     * Increase the quantity
     * update TextView
     */
    private void increaseQuantity() {
        //update quantity and textView
        b.qty.setText(++qty+"");
    }

    /**
     * Decrease the quantity
     * update TextView
     */
    private void decreaseQuantity() {

        //check quantity
        if(qty==0){
            //show toast message
            Toast.makeText(this, "Quantity is already 0", Toast.LENGTH_SHORT).show();
            return;
        }

        //update quantity and textView
        b.qty.setText(--qty+"");
    }



}