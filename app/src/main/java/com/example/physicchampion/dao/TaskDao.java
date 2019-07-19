package com.example.physicchampion.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;

import com.example.physicchampion.model.Task;
import com.example.physicchampion.model.User;

@Dao
public interface TaskDao {

    @Insert
    void insert(Task... task);

    @Update
    void update(Task... task);

    @Delete
    void delete(Task... task);


}
