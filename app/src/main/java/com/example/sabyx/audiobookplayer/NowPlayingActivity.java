package com.example.sabyx.audiobookplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Audiobook audiobook = (Audiobook) getIntent().getSerializableExtra(LibraryActivity.EXTRA_KEY);

        TextView nameTextView = findViewById(R.id.audiobook_name_text_view);
        nameTextView.setText(getString(R.string.name_text, audiobook.getName()));
        TextView authorTextView = findViewById(R.id.audiobook_author_text_view);
        authorTextView.setText(getString(R.string.author_text, audiobook.getAuthor()));
        TextView durationTextView = findViewById(R.id.audiobook_duration_text_view);
        durationTextView.setText(getString(R.string.duration_text, audiobook.getDuration()));
        TextView descriptionTextView = findViewById(R.id.audiobook_description_text_view);
        descriptionTextView.setText(getString(R.string.description_text, audiobook.getDescription()));

        Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              finish();
            }
        });

        Button playButton = findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("NowPlayingActivity", "Playing!");
            }
        });
    }
}
