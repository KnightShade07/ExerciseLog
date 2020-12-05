package com.example.exerciselog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // The current day of exercise the user is on
int exerciseDay;
//The name of the exercise
public String exerciseName;
//The number of Reps done for the exercise.
public int numOfReps;
//How much time was spent doing the exercise.
public String timeSpent;
//mins, hours, etc.
public String timeType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityNavigator();
    }

    private void activityNavigator(){
        Button changeActivities = findViewById(R.id.btnLogPage);
        changeActivities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ExerciseRecordKeeper.class));
            }
        });
    }
}