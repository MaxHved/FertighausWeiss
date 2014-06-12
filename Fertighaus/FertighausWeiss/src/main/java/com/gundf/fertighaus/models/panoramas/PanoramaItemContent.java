package com.gundf.fertighaus.models.panoramas;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.gundf.fertighaus.models.picture.Picture;

import java.util.List;

public class PanoramaItemContent {

    @SerializedName(value = "id")
    private long mID;

    @SerializedName(value = "panorama_name")
    private String mName;

    @SerializedName(value = "picture")
    private Picture mPicture;

    @SerializedName(value = "entry_url")
    private String mUrl;

    @SerializedName(value = "created_at")
    private String mCreatedAt;

    @SerializedName(value = "updated_at")
    private String mUpdatedAt;

    public PanoramaItemContent() {

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

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
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
        public List<PanoramaItemContent> items;
    }

    public static List<PanoramaItemContent> getTestList() {
        list list1 = new Gson().fromJson(JSON, list.class);
        return list1.items;
    }

    private static final String JSON = "{ \"list\": [\n" +
            "            {\n" +
            "                \"id\": \"3\",\n" +
            "                \"panorama_name\": \"SONNENENERGIEHAUS STYLE\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/panoramas/pictures/2e12d88d44b1e0b6137779d6ff2bf7bed2872e89.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/panoramas/pictures/2e12d88d44b1e0b6137779d6ff2bf7bed2872e89_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/panoramas/pictures/2e12d88d44b1e0b6137779d6ff2bf7bed2872e89_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/panoramas/pictures/2e12d88d44b1e0b6137779d6ff2bf7bed2872e89_1024x.jpg\"\n" +
            "                },\n" +
            "                \"entry_url\": \"http://148.251.86.105:81/upload/panoramas/archives/entry/95FutsP1Nt4I/Oberrot1.html\",\n" +
            "                \"created_at\": \"2014-06-10 21:36:17\",\n" +
            "                \"updated_at\": \"2014-06-10 21:36:17\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"4\",\n" +
            "                \"panorama_name\": \"Shur\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/panoramas/pictures/860666f5445eb573f9e3e764711fdbd698b9df93.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/panoramas/pictures/860666f5445eb573f9e3e764711fdbd698b9df93_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/panoramas/pictures/860666f5445eb573f9e3e764711fdbd698b9df93_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/panoramas/pictures/860666f5445eb573f9e3e764711fdbd698b9df93_1024x.jpg\"\n" +
            "                },\n" +
            "                \"entry_url\": \"http://148.251.86.105:81/upload/panoramas/archives/entry/j08lc8DkCE3X/Shur.html\",\n" +
            "                \"created_at\": \"2014-06-10 21:46:57\",\n" +
            "                \"updated_at\": \"2014-06-10 21:46:57\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"5\",\n" +
            "                \"panorama_name\": \"Vision\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/panoramas/pictures/60481f28484581e23d92e5733fb998c988587ff1.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/panoramas/pictures/60481f28484581e23d92e5733fb998c988587ff1_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/panoramas/pictures/60481f28484581e23d92e5733fb998c988587ff1_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/panoramas/pictures/60481f28484581e23d92e5733fb998c988587ff1_1024x.jpg\"\n" +
            "                },\n" +
            "                \"entry_url\": \"http://148.251.86.105:81/upload/panoramas/archives/entry/6Fp39uVwN1Cu/Oberrot2.html\",\n" +
            "                \"created_at\": \"2014-06-10 22:58:02\",\n" +
            "                \"updated_at\": \"2014-06-10 22:58:02\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"6\",\n" +
            "                \"panorama_name\": \"Manheim\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/panoramas/pictures/c35400ed607af5ec742ea5269158736869ca8c57.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/panoramas/pictures/c35400ed607af5ec742ea5269158736869ca8c57_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/panoramas/pictures/c35400ed607af5ec742ea5269158736869ca8c57_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/panoramas/pictures/c35400ed607af5ec742ea5269158736869ca8c57_1024x.jpg\"\n" +
            "                },\n" +
            "                \"entry_url\": \"http://148.251.86.105:81/upload/panoramas/archives/entry/XU5qok1dM27B/Manheim1.html\",\n" +
            "                \"created_at\": \"2014-06-10 22:59:56\",\n" +
            "                \"updated_at\": \"2014-06-10 22:59:56\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"7\",\n" +
            "                \"panorama_name\": \"Erlangen\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/panoramas/pictures/9a76ff84793c9291342ec7abf82c69b9bae7b9a6.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/panoramas/pictures/9a76ff84793c9291342ec7abf82c69b9bae7b9a6_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/panoramas/pictures/9a76ff84793c9291342ec7abf82c69b9bae7b9a6_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/panoramas/pictures/9a76ff84793c9291342ec7abf82c69b9bae7b9a6_1024x.jpg\"\n" +
            "                },\n" +
            "                \"entry_url\": \"http://148.251.86.105:81/upload/panoramas/archives/entry/ECwd73sOaJ49/Hasseldorf.html\",\n" +
            "                \"created_at\": \"2014-06-10 23:00:59\",\n" +
            "                \"updated_at\": \"2014-06-10 23:00:59\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"8\",\n" +
            "                \"panorama_name\": \"Manheim 2\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/panoramas/pictures/8018e981d02c94e9f8e0893664d49615f7ce3259.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/panoramas/pictures/8018e981d02c94e9f8e0893664d49615f7ce3259_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/panoramas/pictures/8018e981d02c94e9f8e0893664d49615f7ce3259_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/panoramas/pictures/8018e981d02c94e9f8e0893664d49615f7ce3259_1024x.jpg\"\n" +
            "                },\n" +
            "                \"entry_url\": \"http://148.251.86.105:81/upload/panoramas/archives/entry/yRc1GA43q4Sp/Manheim2.html\",\n" +
            "                \"created_at\": \"2014-06-10 23:02:02\",\n" +
            "                \"updated_at\": \"2014-06-10 23:02:02\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"9\",\n" +
            "                \"panorama_name\": \"BadVibel\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/panoramas/pictures/6b89dc19efb99b7295d046a5a8345f6a5afabcf6.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/panoramas/pictures/6b89dc19efb99b7295d046a5a8345f6a5afabcf6_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/panoramas/pictures/6b89dc19efb99b7295d046a5a8345f6a5afabcf6_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/panoramas/pictures/6b89dc19efb99b7295d046a5a8345f6a5afabcf6_1024x.jpg\"\n" +
            "                },\n" +
            "                \"entry_url\": \"http://148.251.86.105:81/upload/panoramas/archives/entry/U3q3vVD6Bwy9/BadVibel.html\",\n" +
            "                \"created_at\": \"2014-06-10 23:03:25\",\n" +
            "                \"updated_at\": \"2014-06-10 23:03:25\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"10\",\n" +
            "                \"panorama_name\": \"Poing\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/panoramas/pictures/a42adffa250bccc881b3f9187ae09f4b9e7a15e4.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/panoramas/pictures/a42adffa250bccc881b3f9187ae09f4b9e7a15e4_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/panoramas/pictures/a42adffa250bccc881b3f9187ae09f4b9e7a15e4_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/panoramas/pictures/a42adffa250bccc881b3f9187ae09f4b9e7a15e4_1024x.jpg\"\n" +
            "                },\n" +
            "                \"entry_url\": \"http://148.251.86.105:81/upload/panoramas/archives/entry/L7cczHK46Og3/Poing.html\",\n" +
            "                \"created_at\": \"2014-06-10 23:04:03\",\n" +
            "                \"updated_at\": \"2014-06-10 23:04:03\"\n" +
            "            }\n" +
            "        ]}";
}
