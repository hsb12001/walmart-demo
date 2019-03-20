
package mx.shosvb.walmart.demo.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LEFTMEDIUM {

    @SerializedName("mimeType")
    @Expose
    private String mimeType;
    @SerializedName("url")
    @Expose
    private String url;

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
