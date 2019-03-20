
package mx.shosvb.walmart.demo.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("jsessionid")
    @Expose
    private String jsessionid;
    @SerializedName("product")
    @Expose
    private Product_ product;
    @SerializedName("serverConfiguration")
    @Expose
    private String serverConfiguration;

    public String getJsessionid() {
        return jsessionid;
    }

    public void setJsessionid(String jsessionid) {
        this.jsessionid = jsessionid;
    }

    public Product_ getProduct() {
        return product;
    }

    public void setProduct(Product_ product) {
        this.product = product;
    }

    public String getServerConfiguration() {
        return serverConfiguration;
    }

    public void setServerConfiguration(String serverConfiguration) {
        this.serverConfiguration = serverConfiguration;
    }

}
