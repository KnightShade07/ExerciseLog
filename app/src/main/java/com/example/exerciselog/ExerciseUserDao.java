package com.example.exerciselog;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface ExerciseUserDao {
    @Query("SELECT * FROM users ORDER BY exerciseDay ASC")
    List<ExerciseUser> getAll();

    @Insert
    void insert(ExerciseUser users);

    @Delete
    void delete(ExerciseUser user);

    @Query("DELETE FROM users")
    void deleteAll();
}
