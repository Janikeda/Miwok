package com.example.android.miwok;

import java.lang.ref.SoftReference;

/**
 * Created by Admin on 17.01.2017.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mSongResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int songResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSongResourceId = songResourceId;
    }
    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceId, int songResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResourceId;
        mSongResourceId = songResourceId;
    }
    public String getDefaultTranslation () {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation () {
        return mMiwokTranslation;
    }

    public int getImageResourceId () {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getSongResourceId () {return mSongResourceId;}

}

