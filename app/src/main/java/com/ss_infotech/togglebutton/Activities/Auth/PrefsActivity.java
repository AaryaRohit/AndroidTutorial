package com.ss_infotech.togglebutton.Activities.Auth;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.ss_infotech.togglebutton.R;

public class PrefsActivity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);
    }
}
