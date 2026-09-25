package org.baltimorecityschools.myrestaurantsel;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class restaurant2 extends AppCompatActivity {

    Button pepperoniBTN;
    Button cheeseBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant2);

        pepperoniBTN = findViewById(R.id.pepperoniBTN);
        cheeseBTN = findViewById(R.id.cheeseBTN);

        pepperoniBTN.setOnClickListener(v -> {
            Toast.makeText(this, "Pepperoni Pizza", Toast.LENGTH_SHORT).show();
        });

        cheeseBTN.setOnClickListener(v -> {
            Toast.makeText(this, "Cheese Pizza", Toast.LENGTH_SHORT).show();
        });
    }
}