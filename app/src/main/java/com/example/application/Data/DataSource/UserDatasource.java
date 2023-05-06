package com.example.application.Data.DataSource;

import androidx.lifecycle.MutableLiveData;

import com.example.application.Data.Models.UserModel;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class UserDatasource{
    private final LinkedList<UserModel> userModels = new LinkedList<>();

    public UserDatasource() {
        for (int i = 1;i<10;i++){
            userModels.add(new UserModel("User"+i,"User"+i+"@mail.ru"));
        }
    }

    public MutableLiveData<LinkedList<UserModel>> getUsers() {
        return new MutableLiveData<>(userModels);
    }
}