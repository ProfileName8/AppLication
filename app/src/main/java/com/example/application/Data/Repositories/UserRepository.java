package com.example.application.Data.Repositories;

import androidx.lifecycle.MutableLiveData;

import com.example.application.Data.DataSource.UserDatasource;
import com.example.application.Data.Models.UserModel;

import java.util.LinkedList;
import java.util.List;

public class UserRepository {
    private final UserDatasource userDatasource;

    public UserRepository(){
        userDatasource=new UserDatasource();
    }

    public MutableLiveData<LinkedList<UserModel>> getUsers(){
        return userDatasource.getUsers();
    }
}




//public class UserRepository {
//    private String user;
//    private String email;
//    private MutableLiveData<UserModel> models;
//
//    public UserRepository(String user, String email){
//        this.user = user;
//        this.email = email;
//        this.models.setValue(new UserModel(this.user,this.email));
//    }
//
//    public MutableLiveData<UserModel> getUsers() {
//        return models;
//    }
//}