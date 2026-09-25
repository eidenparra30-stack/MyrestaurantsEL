package org.baltimorecityschools.myrestaurantsel;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button menuBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuBTN = findViewById(R.id.menuBTN);

        menuBTN.setOnClickListener(v -> {

            Toast.makeText(this, "Opening Menu", Toast.LENGTH_SHORT).show();

            Intent menu = new Intent(MainActivity.this, restaurant2.class);
            startActivity(menu);

        });
    }
}