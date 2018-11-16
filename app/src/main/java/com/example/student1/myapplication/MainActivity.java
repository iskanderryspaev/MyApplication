package com.example.student1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Question, Result;
    EditText Name;
    Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Question = (TextView) findViewById(R.id.Question);
        Name = findViewById(R.id.Name);
        Button= findViewById(R.id.Button);
        Result = findViewById(R.id.Result);


    }
    public void result(View view){
        String name = Name.getText().toString();
        Result.setText("Hello,"+ name);






    }
}
