package com.example.application.UI.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.application.Data.DataSource.AppDatabase;
import com.example.application.Data.DataSource.User;
import com.example.application.R;
import com.example.application.Data.Models.UserModel;
import com.example.application.Domain.UserViewModel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class NewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Button b1 = (Button)findViewById(R.id.N_back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(view.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        Button b2 = (Button) findViewById(R.id.MVVM);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Добавление юзера
                User user= new User();
                user.name="John";
                user.email="John@email.ru";
                AppDatabase.getInstance(getApplicationContext()).userDAO().insert(user);
                //Получение данных
                List<User> listofUsers=AppDatabase.getInstance(getApplicationContext()).userDAO().getAllUsers();
            }
        });
    }
}
