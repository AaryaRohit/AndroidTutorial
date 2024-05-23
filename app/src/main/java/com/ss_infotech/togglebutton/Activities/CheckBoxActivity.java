package com.ss_infotech.togglebutton.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.ss_infotech.togglebutton.R;

public class CheckBoxActivity extends AppCompatActivity {

    CheckBox pizza, coffe, burger;
    Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        pizza = findViewById(R.id.checkBox);
        coffe = findViewById(R.id.checkBox2);
        burger = findViewById(R.id.checkBox3);
        buttonOrder = findViewById(R.id.buttonOrder);

        addCheckBoxListener();
    }

    private void addCheckBoxListener() {
        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalAmount = 0;
                StringBuilder result = new StringBuilder();
                result.append("Select Items : ");
                if (pizza.isChecked()) {
                    result.append("\nPizza 100Rs");
                    totalAmount += 100;
                }
                if (coffe.isChecked()) {
                    result.append("\nCoffe 50Rs");
                    totalAmount += 50;
                }
                if (burger.isChecked()) {
                    result.append("\nBurger 150Rs");
                    totalAmount += 150;
                }

                result.append("\nTotal: " + totalAmount + "Rs");
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}