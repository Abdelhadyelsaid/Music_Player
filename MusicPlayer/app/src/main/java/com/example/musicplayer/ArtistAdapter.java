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

public class ArtistAdapter extends ArrayAdapter<Artist> {
    public ArtistAdapter(Activity context, ArrayList<Artist> artists) {
        super(context, 0, artists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        Artist current = getItem(position);

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artist_description, parent, false);
        }

        ImageView icon = listItemView.findViewById(R.id.list_icon_artistActivity);
        icon.setImageResource(current.getMimage());

        TextView artist_name = listItemView.findViewById(R.id.artist_name_artistActivity);
        artist_name.setText(current.getmArtistName());

        return listItemView;
    }
}
