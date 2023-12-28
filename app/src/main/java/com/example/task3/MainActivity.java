package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.task3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
    public void onAndroidClick(View view)
    {
        Intent intent=new Intent(this,CourseActivity.class);
        intent.putExtra("image",R.drawable.android);
        String Course = getString(R.string.AndroidContent);
        intent.putExtra("course content",Course);
        startActivity(intent);
    }
    public void onIOSClick(View view)
    {
        Intent intent=new Intent(this,CourseActivity.class);
        intent.putExtra("image",R.drawable.ios);
        String Course = getString(R.string.IOS);
        intent.putExtra("course content",Course);
        startActivity(intent);
    }
    public void onFullStackClick(View view)
    {
        Intent intent=new Intent(this,CourseActivity.class);
        intent.putExtra("image",R.drawable.fullstack);
        String Course = getString(R.string.FullStack);
        intent.putExtra("course content",Course);
        startActivity(intent);
    }
}
