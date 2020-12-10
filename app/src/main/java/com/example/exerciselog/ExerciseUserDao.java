package com.example.exerciselog;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface ExerciseUserDao {
    @Query("SELECT * FROM users")
    List<ExerciseUser> getAll();

    @Insert
    void insertAll(ExerciseUser users);

    @Delete
    void delete(ExerciseUser user);
}
