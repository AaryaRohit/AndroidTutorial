package com.ss_infotech.togglebutton.Activities.Auth;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ss_infotech.togglebutton.R;

public class SharedPreferenceActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);
        Button storeinformation = (Button) findViewById(R.id.storeinformation);
        Button showinformation = (Button) findViewById(R.id.showinformation);
        textView = (TextView) findViewById(R.id.txtPrefs);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.storeinformation) {
                    Intent intent = new Intent(SharedPreferenceActivity.this,PrefsActivity.class);
                    startActivity(intent);
                } else if (v.getId() == R.id.showinformation) {
                    displaySharedPreferences();
                } else {
                    Toast.makeText(SharedPreferenceActivity.this, "View id not found", Toast.LENGTH_LONG).show();
                }
//                switch (v.getId()) {
//                    case R.id.storeinformation:
//                        Intent intent = new Intent(SharedPreferenceActivity.this,PrefsActivity.class);
//                        startActivity(intent);
//                        break;
//                    case R.id.showinformation:
//                        displaySharedPreferences();
//                        break;
//                    default:
//                        break;
//                }
            }
        };
        storeinformation.setOnClickListener(listener);
        showinformation.setOnClickListener(listener);
    }


    private void displaySharedPreferences() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(SharedPreferenceActivity.this);
        String username = prefs.getString("username", "Default NickName");
        String passw = prefs.getString("password", "Default Password");
        boolean checkBox = prefs.getBoolean("checkBox", false);
        String listPrefs = prefs.getString("listpref", "Default list prefs");


        StringBuilder builder = new StringBuilder();
        builder.append("Username: " + username + "\n");
        builder.append("Password: " + passw + "\n");
        builder.append("Keep me logged in: " + String.valueOf(checkBox) + "\n");
        builder.append("List preference: " + listPrefs);
        textView.setText(builder.toString());

    }
}