package com.example.physicchampion.dao;

import android.content.ClipData;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;

import com.example.physicchampion.model.User;

@Dao
public interface UserDao {

    @Insert
    void insert(User... user);

    @Update
    void update(User... user);

    @Delete
    void delete(User... user);



}
