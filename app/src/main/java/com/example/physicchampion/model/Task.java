package com.example.physicchampion.model;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "tasks", foreignKeys = @ForeignKey(entity = Task.class,
        parentColumns = "id",
        childColumns = "userId",
        onDelete = CASCADE))
public class Task {

    @PrimaryKey
    public final Long id;
    public String difficulty;
    public String time;
    public String category;
    public String tags;
    public final Long userId;

    public Task(Long id, String difficulty, String time, String category, String tags, Long userId) {
        this.id = id;
        this.difficulty = difficulty;
        this.time = time;
        this.category = category;
        this.tags = tags;
        this.userId = userId;
    }


}
