package com.example.physicchampion.dao;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;



import com.example.physicchampion.model.Comment;
import com.example.physicchampion.model.Task;
import com.example.physicchampion.model.User;


@Database(entities = {Comment.class, Task.class, User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static final String DB_NAME = "physicDatabase.db";
    private static volatile AppDatabase instance;

    static public synchronized AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = create(context);
        }
        return instance;
    }

    private static AppDatabase create(final Context context) {
        return Room.databaseBuilder(
                context,
                AppDatabase.class,
                DB_NAME).build();
    }


    public abstract UserDao getUserDAO();
    public abstract TaskDao getTaskDAO();
    public abstract CommentDao getCommentDAO();

}