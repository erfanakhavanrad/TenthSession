package com.example.tenthsession;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);
        VideoView vv = findViewById(R.id.vv);
        String url = "https://as8.cdn.asset.aparat.com/aparat-video/9156de08a1129fac5fc1ad4184b8dfe520180970-144p__73674.mp4";
        vv.setVideoURI(Uri.parse(url));
        vv.setMediaController(new MediaController(VideoViewActivity.this));
        vv.start();
    }
}
