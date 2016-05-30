package com.example.carolynhemmings.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends AppCompatActivity
        implements View.OnClickListener
{
    private String GOOGLE_API_KEY = "AIzaSyBzRnO-7-LHAwblvIJAC9yuo4oDloCmvHI";
    private String YOUTUBE_VIDEO_ID = "kMS9ATaMJKE";
    private String YOUTUBE_PLAYLIST = "PLb8PuWqgNQu8lqRhREk7KCExrxSLuuYWB";

    private Button playVideoButton;
    private Button playPlaylistButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        playVideoButton = (Button) findViewById(R.id.playVideoButton);
        playPlaylistButton = (Button) findViewById(R.id.playlistButton);

        playVideoButton.setOnClickListener(this);
        playPlaylistButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch(v.getId()) {
            case R.id.playVideoButton:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, GOOGLE_API_KEY, YOUTUBE_VIDEO_ID);
                break;

            case R.id.playlistButton:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, YOUTUBE_PLAYLIST);
                break;

            default:
        }

        if(intent != null) {
            startActivity(intent);
        }


    }
}













