package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.task3.databinding.ActivityCourseBinding;

public class CourseActivity extends AppCompatActivity {
ActivityCourseBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCourseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Bundle bundle = getIntent().getExtras();
        int image=bundle.getInt("image");
        binding.coursePhoto.setImageResource(image);
        String courseContent=bundle.getString("course content");
        binding.textView.setText(courseContent);

    }
}