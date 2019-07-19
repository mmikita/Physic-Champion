package com.example.physicchampion.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;


import static android.arch.persistence.room.ForeignKey.CASCADE;


@Entity(tableName = "comments", foreignKeys = {@ForeignKey(entity = User.class,
        parentColumns = "id",
        childColumns = "userId",
        onDelete = CASCADE), @ForeignKey(entity = Comment.class,
        parentColumns = "id",
        childColumns = "id",
        onDelete = CASCADE), @ForeignKey(entity = Task.class,
        parentColumns = "id",
        childColumns = "taskId",
        onDelete = CASCADE)})
public class Comment {
    @PrimaryKey
    public final Long id;
    public String name;
    public String comment;
    public final long userId;
    public final Long parentCommentId;
    public final Long taskId;

    public Comment(Long id, String name, Long userId, Long parentCommentId, Long taskId, String comment) {
        this.id = id;
        this.name = name;
        this.userId = userId;
        this.parentCommentId = parentCommentId;
        this.taskId = taskId;
        this.comment = comment;
    }


}
