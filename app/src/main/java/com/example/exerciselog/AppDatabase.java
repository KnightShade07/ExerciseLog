package com.example.exerciselog;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {ExerciseUser.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ExerciseUserDao exerciseUserDao();
}
