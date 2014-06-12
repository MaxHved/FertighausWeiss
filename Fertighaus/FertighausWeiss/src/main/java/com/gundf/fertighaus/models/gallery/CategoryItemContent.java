package com.gundf.fertighaus.models.gallery;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.gundf.fertighaus.models.picture.Picture;

import java.util.List;

public class CategoryItemContent implements Parcelable{

    public static final String EXTRA_CATEGORY_ITEM_CONTENT = "extra_category_item_content";

    @SerializedName(value = "id")
    private long mID;

    @SerializedName(value = "category_name")
    private String mName;

    @SerializedName(value = "picture")
    private Picture mPicture;

    @SerializedName(value = "created_at")
    private String mCreatedAt;

    @SerializedName(value = "updated_at")
    private String mUpdatedAt;

    public CategoryItemContent() {

    }

    public long getID() {
        return mID;
    }

    public void setID(long ID) {
        mID = ID;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Picture getPicture() {
        return mPicture;
    }

    public void setPicture(Picture picture) {
        mPicture = picture;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        mUpdatedAt = updatedAt;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    private CategoryItemContent(Parcel in) {
        mID = in.readLong();
        mName = in.readString();
        mPicture = in.readParcelable(Picture.class.getClassLoader());
        mCreatedAt = in.readString();
        mUpdatedAt = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(mID);
        dest.writeString(mName);
        dest.writeParcelable(mPicture, flags);
        dest.writeString(mCreatedAt);
        dest.writeString(mUpdatedAt);
    }

    public static final Parcelable.Creator<CategoryItemContent> CREATOR = new Parcelable.Creator<CategoryItemContent>() {
        public CategoryItemContent createFromParcel(Parcel in) {
            return new CategoryItemContent(in);
        }

        public CategoryItemContent[] newArray(int size) {
            return new CategoryItemContent[size];
        }
    };

    private class list {
        @SerializedName(value = "list")
        public List<CategoryItemContent> items;
    }

    public static List<CategoryItemContent> getTestList() {
        list list1 = new Gson().fromJson(JSON, list.class);
        return list1.items;
    }

    private static final String JSON = "{\"list\": [\n" +
            "            {\n" +
            "                \"id\": \"4\",\n" +
            "                \"category_name\": \"Bauhaus\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/categories/5ff3c50b6bf6ef5cc128d7b4a990120661d7a49d.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/categories/5ff3c50b6bf6ef5cc128d7b4a990120661d7a49d_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/categories/5ff3c50b6bf6ef5cc128d7b4a990120661d7a49d_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/categories/5ff3c50b6bf6ef5cc128d7b4a990120661d7a49d_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-10 23:36:43\",\n" +
            "                \"updated_at\": \"2014-06-10 23:55:45\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"3\",\n" +
            "                \"category_name\": \"Musterhäuser\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/categories/0821d32a98b7d006b9d8225c5fffb21ab930503d.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/categories/0821d32a98b7d006b9d8225c5fffb21ab930503d_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/categories/0821d32a98b7d006b9d8225c5fffb21ab930503d_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/categories/0821d32a98b7d006b9d8225c5fffb21ab930503d_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-04 14:20:14\",\n" +
            "                \"updated_at\": \"2014-06-10 22:03:38\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"5\",\n" +
            "                \"category_name\": \"Satteldach\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/categories/df97689497c2962de2ff47bc72070d114e2eec68.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/categories/df97689497c2962de2ff47bc72070d114e2eec68_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/categories/df97689497c2962de2ff47bc72070d114e2eec68_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/categories/df97689497c2962de2ff47bc72070d114e2eec68_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-10 23:49:21\",\n" +
            "                \"updated_at\": \"2014-06-10 23:49:21\"\n" +
            "            }\n" +
            "        ]}";
}
