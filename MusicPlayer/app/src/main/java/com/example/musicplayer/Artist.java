package com.example.musicplayer;

    public class Artist {
        private String mArtistName;
        private int mimage;

        public Artist(String ArtistName, int image){
            mArtistName=ArtistName;
            mimage=image;
        }
        public String getmArtistName(){
            return mArtistName;
        }
        public int getMimage(){ return mimage;}
    }

