package com.example.application.Data.DataSource;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.application.Data.DataSource.Room.Entity.User;
import com.example.application.Data.Models.UserModel;

import java.util.LinkedList;
import java.util.List;


public class UserDatasource{
    private final LinkedList<UserModel> Models = new LinkedList<>();
    private final LinkedList<User> users = new LinkedList<>();

    public UserDatasource() {
        for (int i = 1;i<10;i++){
            Models.add(new UserModel("User"+i,"User"+i+"@mail.ru"));
            users.add(new User("User"+i,"User"+i+"@mail.ru"));
        }
    }

    public LiveData<List<UserModel>> getModels() {
        return new MutableLiveData<>(Models);
    }

    public LiveData<List<User>> getUsers(){
        return new MutableLiveData<>(users);
    }
}