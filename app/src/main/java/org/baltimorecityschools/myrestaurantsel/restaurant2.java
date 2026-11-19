package org.baltimorecityschools.myrestaurantsel;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class restaurant2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant2);

        Button pepperoniBTN = findViewById(R.id.pepperoniBTN);
        Button cheeseBTN = findViewById(R.id.cheeseBTN);

        Button pepperoniSmallBTN = findViewById(R.id.pepperoniSmallBTN);
        Button pepperoniMediumBTN = findViewById(R.id.pepperoniMediumBTN);
        Button pepperoniLargeBTN = findViewById(R.id.pepperoniLargeBTN);

        Button cheeseSmallBTN = findViewById(R.id.cheeseSmallBTN);
        Button cheeseMediumBTN = findViewById(R.id.cheeseMediumBTN);
        Button cheeseLargeBTN = findViewById(R.id.cheeseLargeBTN);

        Button pepperoniMinusBTN = findViewById(R.id.pepperoniMinusBTN);
        Button pepperoniPlusBTN = findViewById(R.id.pepperoniPlusBTN);

        Button cheeseMinusBTN = findViewById(R.id.cheeseMinusBTN);
        Button cheesePlusBTN = findViewById(R.id.cheesePlusBTN);

        TextView pepperoniQuantityTV = findViewById(R.id.pepperoniQuantityTV);
        TextView cheeseQuantityTV = findViewById(R.id.cheeseQuantityTV);

        Button addCartBTN = findViewById(R.id.addCartBTN);
        Button placeOrderBTN = findViewById(R.id.placeOrderBTN);

        TextView subtotalTV = findViewById(R.id.subtotalTV);
        TextView taxTV = findViewById(R.id.taxTV);
        TextView totalTV = findViewById(R.id.totalTV);


        final int[] pepperoniQuantity = {0};
        final int[] cheeseQuantity = {0};

        final double[] pepperoniPrice = {8.00};
        final double[] cheesePrice = {8.00};


        // Pepperoni pizza button
        pepperoniBTN.setOnClickListener(v -> Toast.makeText(
                restaurant2.this,
                "Pepperoni Pizza",
                Toast.LENGTH_SHORT
        ).show());


        // Cheese pizza button
        cheeseBTN.setOnClickListener(v -> Toast.makeText(
                restaurant2.this,
                "Cheese Pizza",
                Toast.LENGTH_SHORT
        ).show());


        // Pepperoni Small
        pepperoniSmallBTN.setOnClickListener(v -> {
            pepperoniPrice[0] = 7.00;

            Toast.makeText(
                    restaurant2.this,
                    "Pepperoni Small - $7",
                    Toast.LENGTH_SHORT
            ).show();
        });


        // Pepperoni Medium
        pepperoniMediumBTN.setOnClickListener(v -> {
            pepperoniPrice[0] = 10.00;

            Toast.makeText(
                    restaurant2.this,
                    "Pepperoni Medium - $10",
                    Toast.LENGTH_SHORT
            ).show();
        });


        // Pepperoni Large
        pepperoniLargeBTN.setOnClickListener(v -> {
            pepperoniPrice[0] = 15.00;

            Toast.makeText(
                    restaurant2.this,
                    "Pepperoni Large - $15",
                    Toast.LENGTH_SHORT
            ).show();
        });


        // Cheese Small
        cheeseSmallBTN.setOnClickListener(v -> {
            cheesePrice[0] = 7.00;

            Toast.makeText(
                    restaurant2.this,
                    "Cheese Small - $7",
                    Toast.LENGTH_SHORT
            ).show();
        });


        // Cheese Medium
        cheeseMediumBTN.setOnClickListener(v -> {
            cheesePrice[0] = 10.00;

            Toast.makeText(
                    restaurant2.this,
                    "Cheese Medium - $10",
                    Toast.LENGTH_SHORT
            ).show();
        });


        // Cheese Large
        cheeseLargeBTN.setOnClickListener(v -> {
            cheesePrice[0] = 15.00;

            Toast.makeText(
                    restaurant2.this,
                    "Cheese Large - $15",
                    Toast.LENGTH_SHORT
            ).show();
        });


        // Pepperoni +
        pepperoniPlusBTN.setOnClickListener(v -> {

            pepperoniQuantity[0]++;

            pepperoniQuantityTV.setText(
                    String.valueOf(pepperoniQuantity[0])
            );
        });


        // Pepperoni -
        pepperoniMinusBTN.setOnClickListener(v -> {

            if (pepperoniQuantity[0] > 0) {

                pepperoniQuantity[0]--;

                pepperoniQuantityTV.setText(
                        String.valueOf(pepperoniQuantity[0])
                );
            }
        });


        // Cheese +
        cheesePlusBTN.setOnClickListener(v -> {

            cheeseQuantity[0]++;

            cheeseQuantityTV.setText(
                    String.valueOf(cheeseQuantity[0])
            );
        });


        // Cheese -
        cheeseMinusBTN.setOnClickListener(v -> {

            if (cheeseQuantity[0] > 0) {

                cheeseQuantity[0]--;

                cheeseQuantityTV.setText(
                        String.valueOf(cheeseQuantity[0])
                );
            }
        });


        // Add To Cart
        addCartBTN.setOnClickListener(v -> {

            double pepperoniTotal =
                    pepperoniPrice[0] * pepperoniQuantity[0];

            double cheeseTotal =
                    cheesePrice[0] * cheeseQuantity[0];

            double subtotal =
                    pepperoniTotal + cheeseTotal;

            double tax =
                    subtotal * 0.06;

            double total =
                    subtotal + tax;


            subtotalTV.setText(
                    String.format("Subtotal: $%.2f", subtotal)
            );

            taxTV.setText(
                    String.format("Tax: $%.2f", tax)
            );

            totalTV.setText(
                    String.format("Total: $%.2f", total)
            );


            Toast.makeText(
                    restaurant2.this,
                    "Added to cart!",
                    Toast.LENGTH_SHORT
            ).show();
        });


        // Place Order
        placeOrderBTN.setOnClickListener(v -> Toast.makeText(
                restaurant2.this,
                "Order Placed!",
                Toast.LENGTH_SHORT
        ).show());
    }
}