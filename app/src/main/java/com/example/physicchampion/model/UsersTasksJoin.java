package com.example.physicchampion.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

@Entity(tableName = "user_task_join",
        primaryKeys = { "userId", "repoId" },
        foreignKeys = {
                @ForeignKey(entity = User.class,
                        parentColumns = "id",
                        childColumns = "userId"),
                @ForeignKey(entity = Task.class,
                        parentColumns = "id",
                        childColumns = "taskId")
        })
public class UsersTasksJoin {
    public final int userId;
    public final int taskId;

    public UsersTasksJoin(int userId, int taskId) {
        this.userId = userId;
        this.taskId = taskId;
    }
}
