package com.example.physicchampion.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;



import java.util.List;


@Entity(tableName = "users")
public class User {

    @PrimaryKey
    public Long id;
    public String email;
    public String password;

    public User(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }



}
