package com.gundf.fertighaus.models.gallery;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.gundf.fertighaus.models.picture.Picture;

import java.util.List;

public class GalleryPicturesItemContent {

    @SerializedName(value = "id")
    private long mID;

    @SerializedName(value = "picture_name")
    private String mName;

    @SerializedName(value = "short_text")
    private String mShotDescription;

    @SerializedName(value = "full_text")
    private String mDescription;

    @SerializedName(value = "picture")
    private Picture mPicture;

    @SerializedName(value = "created_at")
    private String mCreatedAt;

    @SerializedName(value = "updated_at")
    private String mUpdatedAt;

    public GalleryPicturesItemContent() {

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

    public String getShotDescription() {
        return mShotDescription;
    }

    public void setShotDescription(String shotDescription) {
        mShotDescription = shotDescription;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
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

    private class list {
        @SerializedName(value = "list")
        public List<GalleryPicturesItemContent> items;
    }

    public static List<GalleryPicturesItemContent> getTestList() {
        list list1 = new Gson().fromJson(JSON, list.class);
        return list1.items;
    }

    private static final String JSON = "{\"list\": [\n" +
            "            {\n" +
            "                \"id\": \"13\",\n" +
            "                \"picture_name\": \"HAUS RAUCH\",\n" +
            "                \"short_text\": \"von aussen\",\n" +
            "                \"full_text\": null,\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/galleries/pictures/f11cc8eb172f4d9ffc3b0d6ac98f39a37b69e134.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/galleries/pictures/f11cc8eb172f4d9ffc3b0d6ac98f39a37b69e134_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/galleries/pictures/f11cc8eb172f4d9ffc3b0d6ac98f39a37b69e134_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/galleries/pictures/f11cc8eb172f4d9ffc3b0d6ac98f39a37b69e134_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-10 23:46:07\",\n" +
            "                \"updated_at\": \"2014-06-10 23:46:07\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"14\",\n" +
            "                \"picture_name\": \"HAUS RAUCH\",\n" +
            "                \"short_text\": \"von aussen\",\n" +
            "                \"full_text\": null,\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/galleries/pictures/ed4d6884a59d33a415addda1d1b593a0a8848d9b.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/galleries/pictures/ed4d6884a59d33a415addda1d1b593a0a8848d9b_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/galleries/pictures/ed4d6884a59d33a415addda1d1b593a0a8848d9b_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/galleries/pictures/ed4d6884a59d33a415addda1d1b593a0a8848d9b_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-10 23:46:07\",\n" +
            "                \"updated_at\": \"2014-06-10 23:46:07\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"15\",\n" +
            "                \"picture_name\": \"HAUS RAUCH\",\n" +
            "                \"short_text\": \"von aussen\",\n" +
            "                \"full_text\": null,\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/galleries/pictures/b0dec826f1d79730b5250a764f206f181dd8d418.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/galleries/pictures/b0dec826f1d79730b5250a764f206f181dd8d418_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/galleries/pictures/b0dec826f1d79730b5250a764f206f181dd8d418_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/galleries/pictures/b0dec826f1d79730b5250a764f206f181dd8d418_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-10 23:46:07\",\n" +
            "                \"updated_at\": \"2014-06-10 23:46:07\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"16\",\n" +
            "                \"picture_name\": \"HAUS RAUCH\",\n" +
            "                \"short_text\": \"Wonzimmer\",\n" +
            "                \"full_text\": null,\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/galleries/pictures/495869d348f2561cf71baddef8843805fa317d8a.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/galleries/pictures/495869d348f2561cf71baddef8843805fa317d8a_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/galleries/pictures/495869d348f2561cf71baddef8843805fa317d8a_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/galleries/pictures/495869d348f2561cf71baddef8843805fa317d8a_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-10 23:46:07\",\n" +
            "                \"updated_at\": \"2014-06-10 23:46:07\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"17\",\n" +
            "                \"picture_name\": \"HAUS RAUCH\",\n" +
            "                \"short_text\": \"Badezimmer\",\n" +
            "                \"full_text\": null,\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/galleries/pictures/9de4a61a2365a4e4af89e0f94c11c61fc9143784.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/galleries/pictures/9de4a61a2365a4e4af89e0f94c11c61fc9143784_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/galleries/pictures/9de4a61a2365a4e4af89e0f94c11c61fc9143784_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/galleries/pictures/9de4a61a2365a4e4af89e0f94c11c61fc9143784_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-10 23:46:07\",\n" +
            "                \"updated_at\": \"2014-06-10 23:46:07\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"18\",\n" +
            "                \"picture_name\": \"HAUS RAUCH\",\n" +
            "                \"short_text\": \"Küche\",\n" +
            "                \"full_text\": null,\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/galleries/pictures/bbc8c3bbff375553e4f3a7dea044ee2c70d67511.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/galleries/pictures/bbc8c3bbff375553e4f3a7dea044ee2c70d67511_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/galleries/pictures/bbc8c3bbff375553e4f3a7dea044ee2c70d67511_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/galleries/pictures/bbc8c3bbff375553e4f3a7dea044ee2c70d67511_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-10 23:46:07\",\n" +
            "                \"updated_at\": \"2014-06-10 23:46:07\"\n" +
            "            }\n" +
            "        ]}";
}
