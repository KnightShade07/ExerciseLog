package com.example.exerciselog;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ExerciseViewModel extends AndroidViewModel {

    private ExerciseRepository eRepository;

    private final LiveData<List<ExerciseUser>> allExercises;

    public ExerciseViewModel(@NonNull Application application, LiveData<List<ExerciseUser>> allExercises) {
        super(application);
        this.allExercises = allExercises;
    }

    LiveData<List<ExerciseUser>> getAllExercises(){return allExercises;}

    public void insert(ExerciseUser user) {eRepository.insert(user);}
}
