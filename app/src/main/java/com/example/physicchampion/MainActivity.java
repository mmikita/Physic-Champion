package com.example.physicchampion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.physicchampion.view.TaskCartActivity;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //new TestCall(this).execute();

        Intent intent = new Intent(this, TaskCartActivity.class);
        startActivity(intent);






    }
}
