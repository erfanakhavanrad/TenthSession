package com.example.tenthsession;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtHtml = findViewById(R.id.txtHtml);
        txtHtml.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
        Intent intent = new Intent(MainActivity.this, TestService.class);
//        startService(intent);

    }
}
