package com.example.application.Data.DataSource.Room.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.application.Data.DataSource.Room.Entity.User;
import com.example.application.Data.Models.UserModel;

import java.util.List;

@Dao
public interface UserDAO {
    @Insert
    void insert(User user);
    @Query("SELECT * FROM users WHERE name LIKE :name")
    LiveData<List<User>> findByName(String name);
    @Query("SELECT * FROM users")
    LiveData<List<User>> getAllUsers();
    @Delete
    void deleteAll();
}
