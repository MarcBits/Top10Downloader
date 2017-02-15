package com.marcbits.top10downloader;

/**
 * Created by marc on 2/15/17
 * for MarcBits
 * Contact: marcbits_at_outlook_dot_com
 */

public class FeedEntry {

    private String mName;
    private String mArtist;
    private String mReleaseDate;
    private String mSummary;
    private String mImageURL;

    public String getName() {
        return mName;
    }

    public void setName(String pName) {
        mName = pName;
    }

    public String getArtist() {
        return mArtist;
    }

    public void setArtist(String pArtist) {
        mArtist = pArtist;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(String pReleaseDate) {
        mReleaseDate = pReleaseDate;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String pSummary) {
        mSummary = pSummary;
    }

    public String getImageURL() {
        return mImageURL;
    }

    public void setImageURL(String pImageURL) {
        mImageURL = pImageURL;
    }

    @Override
    public String toString() {
        return  "mName=" + mName + '\n' +
                ", mArtist=" + mArtist + '\n' +
                ", mReleaseDate=" + mReleaseDate + '\n' +
                ", mImageURL=" + mImageURL + '\n';
    }
}
