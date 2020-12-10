package com.example.exerciselog;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Entity;
import androidx.room.Insert;
import androidx.room.PrimaryKey;
import androidx.room.Query;

@Entity(tableName = "users")
public class ExerciseUser {
    @PrimaryKey(autoGenerate = true)
    public int userID;
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


}


