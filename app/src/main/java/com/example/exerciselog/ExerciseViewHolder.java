package com.example.exerciselog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ExerciseViewHolder extends RecyclerView.ViewHolder {
    private final TextView exerciseItemView;

    private ExerciseViewHolder(View itemView) {
        super(itemView);
        exerciseItemView = itemView.findViewById(R.id.txtExerciseLog);
    }

    public void bind(String text) {
        exerciseItemView.setText(text);
    }

    static ExerciseViewHolder create(ViewGroup parent){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_exercise_record_keeper, parent, false);
        return new ExerciseViewHolder(view);
    }
}
