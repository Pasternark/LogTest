package com.example.logtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Main Activity", "Ejemplo log Debug");
        Log.i("Main Activity Info 1", "Log tester");
        Log.i("Main Activity Mensaje random", "Prueba de mensaje en log");
    }
}