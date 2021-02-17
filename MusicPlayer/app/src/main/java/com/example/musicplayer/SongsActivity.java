package com.example.musicplayer;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<Song> songs =new ArrayList<Song>();
        songs.add(new Song("Yenken","Abo Al Anwar"));
        songs.add(new Song("Yenken","Abo Al Anwar"));
        songs.add(new Song("Yenken","Abo Al Anwar"));
        songs.add(new Song("Yenken","Abo Al Anwar"));
        songs.add(new Song("Yenken","Abo Al Anwar"));
        songs.add(new Song("Yenken","Abo Al Anwar"));
        songs.add(new Song("Yenken","Abo Al Anwar"));
        songs.add(new Song("Yenken","Abo Al Anwar"));
        songs.add(new Song("Yenken","Abo Al Anwar"));
        songs.add(new Song("Yenken","Abo Al Anwar"));
        songs.add(new Song("Yenken","Abo Al Anwar"));

        SongAdapter adapter = new SongAdapter(this,songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
