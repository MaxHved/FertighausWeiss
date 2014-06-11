package com.gundf.fertighaus.models.picture;

import com.google.gson.annotations.SerializedName;

public class Picture {

    @SerializedName(value = "original")
    private String mOriginal;

    @SerializedName(value = "small")
    private String mSmall;

    @SerializedName(value = "medium")
    private String mMedium;

    @SerializedName(value = "big")
    private String mBig;

    public Picture() {

    }

    public String getOriginal() {
        return mOriginal;
    }

    public void setOriginal(String original) {
        mOriginal = original;
    }

    public String getSmall() {
        return mSmall;
    }

    public void setSmall(String small) {
        mSmall = small;
    }

    public String getMedium() {
        return mMedium;
    }

    public void setMedium(String medium) {
        mMedium = medium;
    }

    public String getBig() {
        return mBig;
    }

    public void setBig(String big) {
        mBig = big;
    }
}
