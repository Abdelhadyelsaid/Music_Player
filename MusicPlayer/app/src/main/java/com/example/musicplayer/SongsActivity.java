package com.example.musicplayer;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        Button playlists = findViewById(R.id.playlists_SongActivity);
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(SongsActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });

        Button artists = findViewById(R.id.artist_SongActivity);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ArtistsIntent = new Intent(SongsActivity.this, ArtistsActivity.class);
                startActivity(ArtistsIntent);
            }
        });

        ArrayList<Song> songs = new ArrayList<Song>();
        String SongName[] = {"Beliver", "Sugar", "Perfect", "Bad liar", "Sorry", "lean on", "Diamond"};
        String ArtistName[] = {"Imagine Dragons", "Maroon 5", "One Direction", "Imagine Dragons", "Halsey", "Major Lazer", "Rihanaa"};
        int Icon[] = {R.drawable.music_icon};

        for (int i = 0; i < SongName.length; i++) {
            songs.add(new Song(SongName[i], ArtistName[i], Icon[0]));
        }

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(adapter);

    }
}
