package ru.mirea.aslanyan.intentapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String date = getIntent().getStringExtra("date");
        TextView text = findViewById(R.id.textView);
        text.setText(date);
    }
}