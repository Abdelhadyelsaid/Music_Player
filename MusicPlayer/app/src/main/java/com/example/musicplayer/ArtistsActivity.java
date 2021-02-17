package com.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_list);

        Button songs = findViewById(R.id.songs_ArtisrActivity);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        Button playlists = findViewById(R.id.playlists_ArtistActivity);
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(ArtistsActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });


        ArrayList<Artist> artist = new ArrayList<Artist>();
        String ArtistName[] = {"Imagine Dragons", "Maroon 5", "One Direction", "Imagine Dragons", "Halsey", "Major Lazer", "Rihanaa"};
        int Icon[] = {R.drawable.artist};

        for (int i = 0; i < ArtistName.length; i++) {
            artist.add(new Artist(ArtistName[i], Icon[0]));
        }

        ArtistAdapter adapter = new ArtistAdapter(this, artist);

        ListView listView = findViewById(R.id.artist_list);

        listView.setAdapter(adapter);
    }
}
