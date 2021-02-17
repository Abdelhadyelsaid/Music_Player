package com.example.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        Song current = getItem(position);

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_description, parent, false);
        }

        ImageView icon = listItemView.findViewById(R.id.list_icon);
        icon.setImageResource(current.getMimage());

        TextView song_name = listItemView.findViewById(R.id.song_name);
        song_name.setText(current.getmSongName());

        TextView artist_name = listItemView.findViewById(R.id.artist_name_SongActivity);
        artist_name.setText(current.getmArtistName());

        return listItemView;
    }
}
