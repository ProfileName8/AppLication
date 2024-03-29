package com.example.application.Data.DataSource.Room.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.application.Data.DataSource.Room.Entity.User;
import com.example.application.Data.DataSource.Room.Dao.UserDAO;

import java.util.concurrent.Executor;

@Database(entities = {User.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public Executor databaseWriteExecutor;

    public abstract UserDAO userDAO();
    private static AppDatabase instance;

    public static AppDatabase getInstance(Context context) {
        if (instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class,"app_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
