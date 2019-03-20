
package mx.shosvb.walmart.demo.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BannerDetails {

    @SerializedName("relatedProdBanner")
    @Expose
    private Object relatedProdBanner;
    @SerializedName("upsellProdBanner")
    @Expose
    private Object upsellProdBanner;
    @SerializedName("promotionalBanner")
    @Expose
    private Object promotionalBanner;
    @SerializedName("prodBanner")
    @Expose
    private Object prodBanner;
    @SerializedName("crosssellProdBanner")
    @Expose
    private Object crosssellProdBanner;

    public Object getRelatedProdBanner() {
        return relatedProdBanner;
    }

    public void setRelatedProdBanner(Object relatedProdBanner) {
        this.relatedProdBanner = relatedProdBanner;
    }

    public Object getUpsellProdBanner() {
        return upsellProdBanner;
    }

    public void setUpsellProdBanner(Object upsellProdBanner) {
        this.upsellProdBanner = upsellProdBanner;
    }

    public Object getPromotionalBanner() {
        return promotionalBanner;
    }

    public void setPromotionalBanner(Object promotionalBanner) {
        this.promotionalBanner = promotionalBanner;
    }

    public Object getProdBanner() {
        return prodBanner;
    }

    public void setProdBanner(Object prodBanner) {
        this.prodBanner = prodBanner;
    }

    public Object getCrosssellProdBanner() {
        return crosssellProdBanner;
    }

    public void setCrosssellProdBanner(Object crosssellProdBanner) {
        this.crosssellProdBanner = crosssellProdBanner;
    }

}
