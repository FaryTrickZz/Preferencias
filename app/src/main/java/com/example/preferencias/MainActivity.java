package com.example.preferencias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.buttonPreference);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Preferences.class));
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
                Log.i("DAM", "Opcion 1 = "+ prefs.getBoolean("clave1", Boolean.FALSE));
                Log.i("DAM", "Opcion 2 = "+ prefs.getString("clave2", "No definida"));
                Log.i("DAM", "Opcion 3 = "+ prefs.getString("clave3", "No definida"));
            }
        });


    }
}