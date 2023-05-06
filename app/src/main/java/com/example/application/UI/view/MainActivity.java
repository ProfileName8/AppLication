package com.example.application.UI.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.application.R;
import com.example.application.UI.view.New2Activity;
import com.example.application.UI.view.NewActivity;

public class MainActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button)findViewById(R.id.M_bToNew);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(view.getContext(), NewActivity.class);
                startActivity(intent);
            }
        });
        Button b2 = (Button) findViewById(R.id.M_bToNew2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), New2Activity.class);
                startActivity(intent);
            }
        });
    }
}