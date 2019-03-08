package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word
 */
public class Word {
    /** Constant to know if an image is provided or not */
    private final static int NO_IMAGE_PROVIDED = -1;

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** The resource ID of the image instead of the "real" image to reduce the amount of resources needed */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** The resource ID of the image instead of the "real" image to reduce the amount of resources needed */
    private int mSoundResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int soundResource){
        this(defaultTranslation, miwokTranslation, NO_IMAGE_PROVIDED, soundResource);
    }


    public Word(String defaultTranslation, String miwokTranslation, int imageResource, int soundResource){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = imageResource;
        this.mSoundResourceId = soundResource;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /**
     * Get the int image resource ID of the word.
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     * Get the int image resource ID of the word.
     */
    public int getSoundResourceId(){
        return mSoundResourceId;
    }

    /**
     * Indicate if this word has an image associated or not
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }
}
