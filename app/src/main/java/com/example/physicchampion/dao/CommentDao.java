package com.example.physicchampion.dao;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;

import com.example.physicchampion.model.Comment;

@Dao
public interface CommentDao {

    @Insert
    void insert(Comment... comment);

    @Update
    void update(Comment... comment);

    @Delete
    void delete(Comment... comment);



}
