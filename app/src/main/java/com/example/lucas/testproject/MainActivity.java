package com.example.lucas.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void testMethod(){
        System.out.print("This worked");
    }

    public void testMethod2(){
        // This worked too!
    }
}
