package com.example.application.Domain;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.example.application.Data.DataSource.Room.Entity.User;
import com.example.application.Data.Models.UserModel;
import com.example.application.Data.Repositories.UserRepository;

import java.util.LinkedList;
import java.util.List;

public class UserViewModel extends ViewModel {

    private final UserRepository userRepository;

    private LiveData<List<UserModel>> users;

    public UserViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.users = userRepository.getDatabaseData();
    }

    public LiveData<List<UserModel>> getUsers() {
        return users;
    }
}