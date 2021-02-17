package com.example.musicplayer;

public class Song {
    private String mSongName;
    private String mArtistName;

    public Song(String SongName, String ArtistName){
        mSongName=SongName;
        mArtistName=ArtistName;
    }
    public String getmSongName(){
        return mSongName;
    }
    public String getmArtistName(){
        return mArtistName;
    }
}
