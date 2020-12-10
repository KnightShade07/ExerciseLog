package com.example.exerciselog;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class ExerciseRepository {
    private ExerciseUserDao exerciseDao;
    private LiveData<List<ExerciseUser>> allExercises;

    ExerciseRepository(Application application) {
        AppDatabase db = AppDatabase.getDatabase(application);
        exerciseDao = db.exerciseUserDao();
        allExercises = (LiveData<List<ExerciseUser>>) exerciseDao.getAll();
    }

    void insert(ExerciseUser exerciseUser) {
        AppDatabase.databaseWriteExecutor.execute(() -> {
            exerciseDao.insert(exerciseUser);
        });
    }
}
