package com.example.gife.movies;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gife.R;

public class horror_movie extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horror_movie);
         VideoView videoView = findViewById(R.id.horror_videoview);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.horror_video;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
         MediaController mediaController = new MediaController(this);
         videoView.setMediaController(mediaController);
         mediaController.setAnchorView(videoView);
    }
}