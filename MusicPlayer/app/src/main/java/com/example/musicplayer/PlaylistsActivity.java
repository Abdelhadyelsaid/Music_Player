package com.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PlaylistsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist_list);


        Button songs = findViewById(R.id.songs_playlistActivity);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(PlaylistsActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        Button artists = findViewById(R.id.artist_playlistActivity);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ArtistsIntent = new Intent(PlaylistsActivity.this, ArtistsActivity.class);
                startActivity(ArtistsIntent);
            }
        });


        ArrayList<Song> playlist = new ArrayList<Song>();
        String PlaylistName[] = {"Top Songs", "Daily mix", "Favourite", "Recently added", "Imagine Dragons"};
        int Icon[] = {R.drawable.playlist};

        for (int i = 0; i < PlaylistName.length; i++) {
            playlist.add(new Song(PlaylistName[i], Icon[0]));
        }

        ArtistAdapter adapter = new ArtistAdapter(this, playlist);

        ListView listView = findViewById(R.id.playlist_list);

        listView.setAdapter(adapter);
    }
}
