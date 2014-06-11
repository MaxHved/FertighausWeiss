package com.gundf.fertighaus.models.catalog;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CatalogItemContent {

    @SerializedName(value = "id")
    private long mID;

    @SerializedName(value = "catalog_name")
    private String mName;

    @SerializedName(value = "catalog_name")
    private PdfFile mPdfFile;

    @SerializedName(value = "created_at")
    private String mCreatedAt;

    @SerializedName(value = "updated_at")
    private String mUpdatedAt;


    public CatalogItemContent() {
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

    public PdfFile getPdfFile() {
        return mPdfFile;
    }

    public void setPdfFile(PdfFile pdfFile) {
        mPdfFile = pdfFile;
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

    public static List<CatalogItemContent> getTestList() {
        list list1 = new Gson().fromJson(JSON, list.class);
        return list1.items;
    }

    private class list {
        @SerializedName(value = "list")
        public List<CatalogItemContent> items;
    }

    private static final String JSON = "{ \"list\": [\n" +
            "            {\n" +
            "                \"id\": \"4\",\n" +
            "                \"catalog_name\": \"Haustechnik\",\n" +
            "                \"pdf_file\": {\n" +
            "                    \"pdf\": \"http://148.251.86.105:81/upload/catalogs/3fed45b7a037ea4ee70a335efaaacea13286ac4b.pdf\",\n" +
            "                    \"preview\": \"http://148.251.86.105:81/upload/catalogs/3fed45b7a037ea4ee70a335efaaacea13286ac4b.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-05-29 12:37:44\",\n" +
            "                \"updated_at\": \"2014-05-29 12:37:44\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"5\",\n" +
            "                \"catalog_name\": \"Bau- beschreibung 2013\",\n" +
            "                \"pdf_file\": {\n" +
            "                    \"pdf\": \"http://148.251.86.105:81/upload/catalogs/62323fc195eff54d6d82a50866965b6d6b813497.pdf\",\n" +
            "                    \"preview\": \"http://148.251.86.105:81/upload/catalogs/62323fc195eff54d6d82a50866965b6d6b813497.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-10 23:13:41\",\n" +
            "                \"updated_at\": \"2014-06-10 23:13:41\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"6\",\n" +
            "                \"catalog_name\": \" Firmenchronik\",\n" +
            "                \"pdf_file\": {\n" +
            "                    \"pdf\": \"http://148.251.86.105:81/upload/catalogs/05357547ebd9f3e3f3292231075a4fafb998ca92.pdf\",\n" +
            "                    \"preview\": \"http://148.251.86.105:81/upload/catalogs/05357547ebd9f3e3f3292231075a4fafb998ca92.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-10 23:14:19\",\n" +
            "                \"updated_at\": \"2014-06-10 23:14:19\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"7\",\n" +
            "                \"catalog_name\": \"Unsere Musterhäuser\",\n" +
            "                \"pdf_file\": {\n" +
            "                    \"pdf\": \"http://148.251.86.105:81/upload/catalogs/93918ce4708f99b304294e40ae01040c73b34584.pdf\",\n" +
            "                    \"preview\": \"http://148.251.86.105:81/upload/catalogs/93918ce4708f99b304294e40ae01040c73b34584.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-10 23:15:27\",\n" +
            "                \"updated_at\": \"2014-06-10 23:15:27\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"8\",\n" +
            "                \"catalog_name\": \"WEISS Basics\",\n" +
            "                \"pdf_file\": {\n" +
            "                    \"pdf\": \"http://148.251.86.105:81/upload/catalogs/47e3201871c2db87ac70536b077d1dc14da39f92.pdf\",\n" +
            "                    \"preview\": \"http://148.251.86.105:81/upload/catalogs/47e3201871c2db87ac70536b077d1dc14da39f92.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-10 23:15:48\",\n" +
            "                \"updated_at\": \"2014-06-10 23:15:48\"\n" +
            "            }\n" +
            "        ]}";
}
