package com.example.musicplayer;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PlaylistsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist_list);

        ArrayList<Artist> playlist =new ArrayList<Artist>();
        String PlaylistName []={"Top Songs","Daily mix","Favourite","Recently added","Imagine Dragons"};
        int Icon[]={R.drawable.playlist};

        for(int i=0;i<PlaylistName.length;i++){
            playlist.add(new Artist(PlaylistName[i], Icon[0]));
        }

        ArtistAdapter adapter = new ArtistAdapter(this,playlist);

        ListView listView = findViewById(R.id.playlist_list);

        listView.setAdapter(adapter);
    }
}
