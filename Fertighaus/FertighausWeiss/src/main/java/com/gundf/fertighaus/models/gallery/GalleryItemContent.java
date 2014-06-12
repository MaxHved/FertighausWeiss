package com.gundf.fertighaus.models.gallery;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.gundf.fertighaus.models.picture.Picture;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GalleryItemContent implements Parcelable {

    public static final String EXTRA_GALLERY_ITEM_CONTENT = "extra_gallery_item_content";

    @SerializedName(value = "id")
    private long mID;

    @SerializedName(value = "gallery_name")
    private String mName;

    @SerializedName(value = "picture")
    private Picture mPicture;

    @SerializedName(value = "created_at")
    private String mCreatedAt;

    @SerializedName(value = "updated_at")
    private String mUpdatedAt;

    public GalleryItemContent() {

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

    private GalleryItemContent(Parcel in) {
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

    public static final Parcelable.Creator<GalleryItemContent> CREATOR = new Parcelable.Creator<GalleryItemContent>() {
        public GalleryItemContent createFromParcel(Parcel in) {
            return new GalleryItemContent(in);
        }

        public GalleryItemContent[] newArray(int size) {
            return new GalleryItemContent[size];
        }
    };

    private class list {
        @SerializedName(value = "list")
        public List<GalleryItemContent> items;
    }

    public static List<GalleryItemContent> getTestList(long idCategoryID) {
        list list1 = new Gson().fromJson(sMap.get(idCategoryID), list.class);
        return list1.items;
    }

    private static Map<Long, String> sMap = new HashMap<Long, String>();

    private static final String JSON3 = "{\"list\": [\n" +
            "            {\n" +
            "                \"id\": \"7\",\n" +
            "                \"gallery_name\": \"BAD VIBEL\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/galleries/b39305be7436a678adc0e076b309f61e89e1003a.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/galleries/b39305be7436a678adc0e076b309f61e89e1003a_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/galleries/b39305be7436a678adc0e076b309f61e89e1003a_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/galleries/b39305be7436a678adc0e076b309f61e89e1003a_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-11 13:52:40\",\n" +
            "                \"updated_at\": \"2014-06-11 13:52:40\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"8\",\n" +
            "                \"gallery_name\": \"ERLANGEN\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/galleries/53ca1ba52f04c1999601f7049efea7b1d3d7629c.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/galleries/53ca1ba52f04c1999601f7049efea7b1d3d7629c_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/galleries/53ca1ba52f04c1999601f7049efea7b1d3d7629c_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/galleries/53ca1ba52f04c1999601f7049efea7b1d3d7629c_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-11 13:55:58\",\n" +
            "                \"updated_at\": \"2014-06-11 13:55:58\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"9\",\n" +
            "                \"gallery_name\": \"FELLBACH EMOTION\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/galleries/1da76e45a47f82d18873b60da55598cb8e2ab48c.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/galleries/1da76e45a47f82d18873b60da55598cb8e2ab48c_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/galleries/1da76e45a47f82d18873b60da55598cb8e2ab48c_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/galleries/1da76e45a47f82d18873b60da55598cb8e2ab48c_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-11 13:59:47\",\n" +
            "                \"updated_at\": \"2014-06-11 13:59:47\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"2\",\n" +
            "                \"gallery_name\": \"MANNHEIM\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/galleries/96375fd71d20f68489fa65a3c1db8b9bc589485a.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/galleries/96375fd71d20f68489fa65a3c1db8b9bc589485a_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/galleries/96375fd71d20f68489fa65a3c1db8b9bc589485a_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/galleries/96375fd71d20f68489fa65a3c1db8b9bc589485a_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-04 14:29:15\",\n" +
            "                \"updated_at\": \"2014-06-04 14:29:15\"\n" +
            "            }\n" +
            "        ]}";

    private static final String JSON4 = "{\"list\": [\n" +
            "            {\n" +
            "                \"id\": \"3\",\n" +
            "                \"gallery_name\": \"HAUS PRZYBILLE\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/galleries/9563f6d7c39ca8769b3634614a5810e192baf4bb.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/galleries/9563f6d7c39ca8769b3634614a5810e192baf4bb_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/galleries/9563f6d7c39ca8769b3634614a5810e192baf4bb_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/galleries/9563f6d7c39ca8769b3634614a5810e192baf4bb_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-10 23:38:09\",\n" +
            "                \"updated_at\": \"2014-06-10 23:40:06\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"4\",\n" +
            "                \"gallery_name\": \"HAUS RAUCH\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/galleries/e14ab997e4dd228d1c0ba059f7cb3328eb12310b.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/galleries/e14ab997e4dd228d1c0ba059f7cb3328eb12310b_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/galleries/e14ab997e4dd228d1c0ba059f7cb3328eb12310b_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/galleries/e14ab997e4dd228d1c0ba059f7cb3328eb12310b_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-10 23:46:07\",\n" +
            "                \"updated_at\": \"2014-06-10 23:46:07\"\n" +
            "            }\n" +
            "        ]}";

    private static final String JSON5 = "{\"list\": [\n" +
            "            {\n" +
            "                \"id\": \"5\",\n" +
            "                \"gallery_name\": \"HAUS BEYER\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/galleries/6781984d1e78507d8e9a442b9b3ea77417eace3f.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/galleries/6781984d1e78507d8e9a442b9b3ea77417eace3f_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/galleries/6781984d1e78507d8e9a442b9b3ea77417eace3f_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/galleries/6781984d1e78507d8e9a442b9b3ea77417eace3f_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-10 23:52:00\",\n" +
            "                \"updated_at\": \"2014-06-10 23:52:00\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"6\",\n" +
            "                \"gallery_name\": \"HAUS MISSELWITZ\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/galleries/4eaf171c206442ac51649c4885d8c7631164de01.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/galleries/4eaf171c206442ac51649c4885d8c7631164de01_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/galleries/4eaf171c206442ac51649c4885d8c7631164de01_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/galleries/4eaf171c206442ac51649c4885d8c7631164de01_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-10 23:55:23\",\n" +
            "                \"updated_at\": \"2014-06-10 23:55:23\"\n" +
            "            }\n" +
            "        ]}";

    static {
        sMap.put(3L, JSON3);
        sMap.put(4L, JSON4);
        sMap.put(5L, JSON5);
    }
}
