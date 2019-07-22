package com.example.physicchampion.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.physicchampion.model.Task;
import com.example.physicchampion.model.User;
import com.example.physicchampion.model.UsersTasksJoin;

import java.util.List;

@Dao
public interface UsersTasksJoinDao {

    @Insert
    void insert(UsersTasksJoin usersTasksJoin);

    @Query("SELECT * FROM users INNER JOIN user_task_join ON users.id=user_task_join.userId WHERE user_task_join.taskId=:taskId")
    List<User> getUsersForTask(final int taskId);


    @Query("SELECT * FROM tasks INNER JOIN user_task_join ON tasks.id=user_task_join.taskId WHERE user_task_join.userId=:userId")
            List<Task> getTasksForUsers(final int userId);

}
