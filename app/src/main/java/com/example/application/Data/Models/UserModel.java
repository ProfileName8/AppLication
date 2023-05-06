package com.example.application.Data.Models;

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
    public String getUser() {
        return user;
    }

    public String getEmail() {
        return email;
    }
}