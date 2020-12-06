package com.example.exerciselog;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface ExerciseUserDao {
    @Query("SELECT * FROM exerciseuser")
    List<ExerciseUser> getAll();

    @Insert
    void insertAll(ExerciseUser users);

    @Delete
    void delete(ExerciseUser user);
}
