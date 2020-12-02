package com.test.butns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Aplycashion app = DemoApplication.configureApplication(DemoApplication.WINDOWS_TYPE);
        app.paint();
    }
}