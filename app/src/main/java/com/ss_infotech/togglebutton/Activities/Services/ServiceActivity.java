package com.ss_infotech.togglebutton.Activities.Services;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.ss_infotech.togglebutton.R;

public class ServiceActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnStartService, btnStopService, btnNextPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_service);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnStartService = findViewById(R.id.btnStartService);
        btnStopService = findViewById(R.id.btnStopService);
        btnNextPage = findViewById(R.id.btnNextPage);

        btnStartService.setOnClickListener(this);
        btnStopService.setOnClickListener(this);
        btnNextPage.setOnClickListener(this);

//        btnStartService.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startService(new Intent(this, MyService.class));
//            }
//        });
//
//        btnStopService.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                stopService(new Intent(this, MyService.class));
//            }
//        });
//
//        btnNextPage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(this, NextActivity.class);
//                startActivity(intent);
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnStartService) {
            startService(new Intent(this, MyService.class));
        } else if (v.getId() == R.id.btnStopService) {
            stopService(new Intent(this, MyService.class));
        } else if (v.getId() == R.id.btnNextPage) {
            Intent intent = new Intent(this, NextActivity.class);
            startActivity(intent);
        }
    }
}