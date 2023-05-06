package com.example.application.UI.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.room.Room;

import com.example.application.Data.DataSource.Room.Dao.UserDAO;
import com.example.application.Data.DataSource.Room.Database.AppDatabase;
import com.example.application.Data.DataSource.Room.Entity.User;
import com.example.application.Domain.UserViewModel;
import com.example.application.R;

import java.util.ArrayList;
import java.util.List;

public class NewActivity extends AppCompatActivity {

    private TextView un,um;
    UserViewModel model = new ViewModelProvider(this).get(UserViewModel.class);

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
        un=findViewById(R.id.user_name);
        um=findViewById(R.id.user_mail);

        Button b2 = (Button) findViewById(R.id.MVVM);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.getUsers().observe(NewActivity.this,t->{
                    un.setText(t.element().getUser());
                    um.setText(t.element().getEmail());
                });
            }
        });
    }
}
