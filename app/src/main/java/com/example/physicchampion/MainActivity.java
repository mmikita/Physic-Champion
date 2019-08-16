package com.example.physicchampion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.example.physicchampion.dao.AppDatabase;
import com.example.physicchampion.model.Comment;
import com.example.physicchampion.model.Task;
import com.example.physicchampion.model.User;


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
