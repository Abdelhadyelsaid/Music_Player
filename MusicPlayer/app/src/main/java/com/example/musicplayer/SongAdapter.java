package com.example.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context, ArrayList<Song> songs){
        super(context,0,songs);
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.songs_list, parent, false);
        }
        Song current=getItem(position);

        Button song_name = listItemView.findViewById(R.id.song_name);
        song_name.setText(current.getmSongName());

        Button artist_name = listItemView.findViewById(R.id.artist_name);
        artist_name.setText(current.getmArtistName());
        return listItemView;
    }
}
