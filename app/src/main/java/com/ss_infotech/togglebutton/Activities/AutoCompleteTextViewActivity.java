package com.ss_infotech.togglebutton.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.ss_infotech.togglebutton.R;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    String[] language = {"C", "C++", "Java", ".NET", "PHP", "Android", "iOS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, R.layout.select_dialog_item, language);
        AutoCompleteTextView actv = findViewById(R.id.autoCompleteTextView);
        actv.setThreshold(1); // will start working from first character
        actv.setAdapter(adapter);
        actv.setTextColor(Color.RED);
    }
}