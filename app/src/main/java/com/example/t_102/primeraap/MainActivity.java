package com.example.t_102.primeraap;

import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Vibrator vibrador= (Vibrator) getSystemService(VIBRATOR_SERVICE);
        vibrador.vibrate(10000);
    }
}
