package com.example.application.Data.Models;

import com.example.application.Data.DataSource.Room.Entity.User;

public class UserModel {
    private String user;
    private String email;

    public UserModel(String user, String email) {
        this.user = user;
        this.email = email;
    }

    public UserModel(UserModel userModel){
        this.user=userModel.getUser();
        this.email=userModel.getEmail();
    }

    public UserModel(User user){
        this.user=user.name;
        this.email=user.email;
    }
    public String getUser() {
        return user;
    }

    public String getEmail() {
        return email;
    }
}