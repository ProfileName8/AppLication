package com.example.application.UI.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.example.application.Data.DataSource.Room.Dao.UserDAO;
import com.example.application.Data.DataSource.Room.Database.AppDatabase;
import com.example.application.Data.DataSource.Room.Entity.User;
import com.example.application.R;

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
                AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                        AppDatabase.class,"database").build();
                UserDAO userDAO = db.userDAO();
                List<User> users = userDAO.getAllUsers();
            }
        });
    }
}
