package com.example.exerciselog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creates the database when the app is started up.
        AppDatabase exerciseDB = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class,"ExerciseDB").build();

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