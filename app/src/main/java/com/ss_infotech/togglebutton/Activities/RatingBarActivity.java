package com.ss_infotech.togglebutton.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.ss_infotech.togglebutton.R;

public class RatingBarActivity extends AppCompatActivity {

    Button btnRatingSubmit;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        btnRatingSubmit = findViewById(R.id.btnSubmit);
        ratingBar = findViewById(R.id.ratingBar);

        btnRatingSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating = String.valueOf(ratingBar.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
            }
        });
    }
}