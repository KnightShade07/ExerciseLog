package com.example.exerciselog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText boxExerciseDay = findViewById(R.id.boxExerciseDay);
    EditText boxExerciseName = findViewById(R.id.boxExerciseName);
    EditText boxReps = findViewById(R.id.boxReps);
    TextView timeSpent =  findViewById(R.id.txtTimeSpent);
    EditText timeQuantity = findViewById(R.id.boxTimeQuantity);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creates the database when the app is started up.
        AppDatabase exerciseDB = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class,"ExerciseDB").build();

        //gets the inputs out of the text boxes
        String exerciseNameContent = boxExerciseName.getText().toString();
        String boxRepsContent = boxReps.getText().toString();
        String timeSpentContent = timeSpent.getText().toString();
        String timeQuantityContent = timeQuantity.getText().toString();



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