package com.gundf.fertighaus.models.news;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.gundf.fertighaus.models.picture.Picture;

import java.util.List;

public class NewsItemContent {

    @SerializedName(value = "id")
    private long mID;

    @SerializedName(value = "news_type")
    private String mType;

    @SerializedName(value = "headline")
    private String mHeadLine;

    @SerializedName(value = "content")
    private String mContent;

    @SerializedName(value = "picture")
    private Picture mPicture;

    @SerializedName(value = "created_at")
    private String mCreatedAt;

    @SerializedName(value = "updated_at")
    private String mUpdatedAt;

    public NewsItemContent() {

    }

    public long getID() {
        return mID;
    }

    public void setID(long ID) {
        mID = ID;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String getHeadLine() {
        return mHeadLine;
    }

    public void setHeadLine(String headLine) {
        mHeadLine = headLine;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
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

    public static List<NewsItemContent> getTestList() {
        list list1 = new Gson().fromJson(JSON, list.class);
        return list1.items;
    }

    private class list {
        @SerializedName(value = "list")
        public List<NewsItemContent> items;
    }

    private static final String JSON = "{\"list\": [\n" +
            "            {\n" +
            "                \"id\": \"3\",\n" +
            "                \"news_type\": \"small\",\n" +
            "                \"headline\": \" Energie Messe Rhein Neckar Schwetzingen 29.03.2014 - 30.03.2014\",\n" +
            "                \"content\": \"Energie Messe Rhein Neckar \\r\\n\\r\\nUnser Fachberater Team aus Mannheim freut sich auf Ihren Besuch!\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/news/089957a0beed2d2fa8f7548125c882364392725a.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/news/089957a0beed2d2fa8f7548125c882364392725a_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/news/089957a0beed2d2fa8f7548125c882364392725a_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/news/089957a0beed2d2fa8f7548125c882364392725a_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-11 10:06:53\",\n" +
            "                \"updated_at\": \"2014-06-11 11:29:45\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"2\",\n" +
            "                \"news_type\": \"big\",\n" +
            "                \"headline\": \"Tag der offenen Tür 11.05.2014\",\n" +
            "                \"content\": \"Wir möchten Sie herzlich zu unserem Tag der offenen Tür am 11. Mai 2014, auf unserem Werksgelände in Oberrot-Scheuerhalden, einladen.\\r\\nBesuchen Sie uns von 10.00 - 17.00 Uhr und überzeugen Sie sich selbst von den konstruktiven und technischen Möglichkeiten einer modernen und energieeffizienten Fertigbauarchitektur.\\r\\nGerne zeigen wir Ihnen im Rahmen von Werksführungen alle Details, Abläufe und Zusammenhänge unserer modernen Hightech-Produktion. Des weiteren ist neben unserem Bauberatungszentrum auch unser Sonnenenergiehaus \\\"Style\\\" im Werks-Musterhauszentrum für Sie geöffnet.\\r\\n\\r\\nUnsere hochqualifizierten Energie- und Fachberater stehen Ihnen sehr gerne Rede und Antwort!\\r\\n\\r\\nWir freuen uns auf Ihr Kommen!\\r\\nIhr Fertighaus Weiss Team.\\r\\n\\r\\nProgramm:\\r\\n- Besichtigung der neuen Produktionshalle\\r\\n- Die WEISS-Eigenstrom-Solaranlage\\r\\n-Baufinanzierungsberatung\\r\\n-Architekturberatung\\r\\n-Energievorträge\\r\\n-geführte Rundgänge mit Werksbesichtung\\r\\n-Besichtigung unserer Musterhäuser im Werks-Musterhauszentrum in Oberrot-Hohenhardtsweiler\\r\\n-für die \\\"Kleinen\\\"  Hüpfburg, Kinderschminken und vieles mehr \\r\\n-Bewirtung\",\n" +
            "                \"picture\": {\n" +
            "                    \"original\": \"http://148.251.86.105:81/upload/news/3f7114b3d5e9d3bf8595e4dac273d2f5fa5de4b4.jpg\",\n" +
            "                    \"small\": \"http://148.251.86.105:81/upload/news/3f7114b3d5e9d3bf8595e4dac273d2f5fa5de4b4_320x.jpg\",\n" +
            "                    \"medium\": \"http://148.251.86.105:81/upload/news/3f7114b3d5e9d3bf8595e4dac273d2f5fa5de4b4_640x.jpg\",\n" +
            "                    \"big\": \"http://148.251.86.105:81/upload/news/3f7114b3d5e9d3bf8595e4dac273d2f5fa5de4b4_1024x.jpg\"\n" +
            "                },\n" +
            "                \"created_at\": \"2014-06-04 14:40:12\",\n" +
            "                \"updated_at\": \"2014-06-04 14:40:12\"\n" +
            "            }\n" +
            "        ]}";
}
