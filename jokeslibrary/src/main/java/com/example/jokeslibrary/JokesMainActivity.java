package com.example.jokeslibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jokes_activity_main);

        String joke = getIntent().getStringExtra("joke");

        TextView jokeTextView = findViewById(R.id.jokeTextView);

        jokeTextView.setText(joke);
    }
}
