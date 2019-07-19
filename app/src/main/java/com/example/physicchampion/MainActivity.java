package com.example.physicchampion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.physicchampion.dao.AppDatabase;
import com.example.physicchampion.model.Comment;
import com.example.physicchampion.model.Task;
import com.example.physicchampion.model.User;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new TestCall(this).execute();






    }
}
