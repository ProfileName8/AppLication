package com.example.application.Data.DataSource.Room.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.application.Data.Models.UserModel;

@Entity(tableName = "users")
public class User {
    @PrimaryKey
    public int id;
    @ColumnInfo(name = "name")
    public String name;
    @ColumnInfo(name = "email")
    public String email;

    public User(String name,String email){
        this.name=name;
        this.email=email;
    }

    public UserModel toDomainModel(){
        return new UserModel(name,email);
    }
}
