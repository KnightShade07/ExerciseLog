package com.example.exerciselog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ExerciseRecordKeeper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_record_keeper);
        TextView txtExerciseLog =  findViewById(R.id.txtExerciseLog);
        txtExerciseLog.setFocusable(false);
        returnButton();


    }
    private void returnButton(){
        Button returnButton = findViewById(R.id.btnDBEntry);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}