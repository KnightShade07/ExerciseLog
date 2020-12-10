package com.example.exerciselog;

import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

public class ExerciseListAdapter extends ListAdapter<ExerciseUser, ExerciseViewHolder> {
    protected ExerciseListAdapter(@NonNull DiffUtil.ItemCallback<ExerciseUser> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return ExerciseViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
        ExerciseUser currentExercise = getItem(position);
        holder.bind(currentExercise.getExerciseName());
    }
}
