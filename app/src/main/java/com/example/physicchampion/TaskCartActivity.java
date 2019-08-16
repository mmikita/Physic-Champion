package com.example.physicchampion;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TaskCartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_cart);
        TextView tx = (TextView)findViewById(R.id.task);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/sciencefair.otf");
        tx.setTypeface(custom_font);





    }
}
