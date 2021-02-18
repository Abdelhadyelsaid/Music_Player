package com.example.musicplayer;

public class Song {
    private String mSongName;
    private String mArtistName;
    private int mimage;

    public Song(String SongName, String ArtistName, int image) {
        mSongName = SongName;
        mArtistName = ArtistName;
        mimage = image;
    }

    public Song(String ArtistName, int image) {
        mArtistName = ArtistName;
        mimage = image;
    }

    public String getmSongName() {
        return mSongName;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public int getMimage() {
        return mimage;
    }
}

