package com.example.android.kids;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Arabic translation for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Arabic translation for the word */
    private String mArabicTranslation;
    /** ImageResourceId for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param arabicTranslation is the word in the Arabic language
     */
    public Word(String defaultTranslation, String arabicTranslation) {
        mDefaultTranslation = defaultTranslation;
        mArabicTranslation = arabicTranslation;
    }
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param arabicTranslation is the word in the Arabic language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */
    public Word(String defaultTranslation, String arabicTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mArabicTranslation = arabicTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Arabic translation of the word.
     */
    public String getArabicTranslation() {
        return mArabicTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
    /**
           * Returns whether or not there is an image for this word.
           */
      public boolean hasImage() {
         return mImageResourceId != NO_IMAGE_PROVIDED;
     }


}