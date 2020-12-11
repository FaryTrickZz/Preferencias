package com.example.preferencias;

import android.os.Bundle;
import android.preference.PreferenceActivity;

@SuppressWarnings("ALL")
public class Preferences extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.opciones);

    }
}
