package com.example.geografia.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.geografia.R;

import java.util.List;

public class StudyAdapter extends RecyclerView.Adapter<StudyAdapter.Holder_Stady> {
    private List<String> text;
    private List<Integer> image;
    private LayoutInflater inflater;

    public StudyAdapter(Context context, List<String> text, List<Integer> image) {
        this.inflater = LayoutInflater.from(context);
        this.text = text;
        this.image = image;
    }

    @NonNull
    @Override
    public Holder_Stady onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.study_holder, parent, false);
        return new Holder_Stady(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder_Stady holder, int position) {
        holder.textView.setText(text.get(position));
        holder.imageView.setImageResource(image.get(position));
    }

    @Override
    public int getItemCount() {
        return text.size();
    }

    public class Holder_Stady extends RecyclerView.ViewHolder {
        private TextView textView;
        private ImageView imageView;

        public Holder_Stady(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_study);
            imageView = itemView.findViewById(R.id.image_study);
        }
    }

}
