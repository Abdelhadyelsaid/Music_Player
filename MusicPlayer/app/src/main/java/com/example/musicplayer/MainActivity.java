package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button song =  findViewById(R.id.songs);
        song.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SongIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(SongIntent);}
        });

        Button album =  findViewById(R.id.albums);
        album.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AlbumIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(AlbumIntent);}
        });

        Button artist =  findViewById(R.id.artists);
        artist.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ArtistIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(ArtistIntent);}
        });




    }


}