package com.gundf.fertighaus.models.picture;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Picture implements Parcelable{

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

    @Override
    public int describeContents() {
        return 0;
    }

    private Picture(Parcel in) {
        mOriginal = in.readString();
        mSmall = in.readString();
        mMedium = in.readString();
        mBig = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mOriginal);
        dest.writeString(mSmall);
        dest.writeString(mMedium);
        dest.writeString(mBig);
    }

    public static final Parcelable.Creator<Picture> CREATOR = new Parcelable.Creator<Picture>() {
        public Picture createFromParcel(Parcel in) {
            return new Picture(in);
        }

        public Picture[] newArray(int size) {
            return new Picture[size];
        }
    };
}
