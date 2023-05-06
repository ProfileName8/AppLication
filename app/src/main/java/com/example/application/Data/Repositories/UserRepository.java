package com.example.application.Data.Repositories;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;

import com.example.application.Data.DataSource.Room.Database.AppDatabase;
import com.example.application.Data.DataSource.Room.Entity.User;
import com.example.application.Data.DataSource.UserDatasource;
import com.example.application.Data.Models.UserModel;

import java.util.List;
import java.util.stream.Collectors;

public class UserRepository {
    private final UserDatasource userDatasource;
    private final AppDatabase appDatabase;

    public UserRepository(Context context){
        userDatasource=new UserDatasource();
        appDatabase = AppDatabase.getInstance(context);
    }

    public void AddUser(UserModel userModel){
        appDatabase.databaseWriteExecutor.execute(()->{
            appDatabase.userDAO().insert(
                    new User(userModel.getUser(),userModel.getEmail()
                    ));
        });
    }

    public LiveData<List<UserModel>> getModels(){
        return userDatasource.getModels();
    }

    public LiveData<List<UserModel>> getDatabaseData(){
        return Transformations.map(
                appDatabase.userDAO().getAllUsers(),
                (values) -> values.stream().map(User::toDomainModel).collect(Collectors.toList())
        );
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