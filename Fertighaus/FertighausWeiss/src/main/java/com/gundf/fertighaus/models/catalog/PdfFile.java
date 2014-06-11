package com.gundf.fertighaus.models.catalog;


import com.google.gson.annotations.SerializedName;

public class PdfFile {

    @SerializedName(value = "updated_at")
    private String mURL;

    @SerializedName(value = "updated_at")
    private String mUrlPreview;

    public PdfFile() {

    }

    public String getURL() {
        return mURL;
    }

    public void setURL(String URL) {
        mURL = URL;
    }

    public String getUrlPreview() {
        return mUrlPreview;
    }

    public void setUrlPreview(String urlPreview) {
        mUrlPreview = urlPreview;
    }
}
