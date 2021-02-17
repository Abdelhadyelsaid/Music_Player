package com.example.musicplayer;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_list);

        ArrayList<Artist> artist =new ArrayList<Artist>();
        String ArtistName[]={"Imagine Dragons","Maroon 5","One Direction","Imagine Dragons","Halsey","Major Lazer","Rihanaa"};
        int Icon[]={R.drawable.artist};

        for(int i=0;i<ArtistName.length;i++){
            artist.add(new Artist(ArtistName[i], Icon[0]));
        }

        ArtistAdapter adapter = new ArtistAdapter(this, artist);

        ListView listView = findViewById(R.id.artist_list);

        listView.setAdapter(adapter);
    }
}
