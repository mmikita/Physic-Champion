package com.example.physicchampion;

import android.content.Context;
import android.os.AsyncTask;

import com.example.physicchampion.dao.AppDatabase;
import com.example.physicchampion.model.Comment;
import com.example.physicchampion.model.Task;
import com.example.physicchampion.model.User;

public class TestCall extends AsyncTask<Void, Void, Integer> {
    public Context context;

    @Override
    protected Integer doInBackground(Void... voids) {

        AppDatabase database = AppDatabase.getInstance(context);
        User user = new User(1L, "email", "haslo");
        Task task = new Task(1L, "bardzo trudne", "25h", "termoelektrotechnika", "fajne, glupie, dziwne", 1L);
        Comment comment = new Comment(4L, "ds", 1L, null, 1L, "komentarz");

        database.getUserDAO().insert(user);
        database.getTaskDAO().insert(task);
        database.getCommentDAO().insert(comment);

        return 0;
    }
public TestCall(Context context){
        this.context = context;

}

}
