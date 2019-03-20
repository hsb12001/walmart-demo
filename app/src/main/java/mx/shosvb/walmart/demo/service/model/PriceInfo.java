
package mx.shosvb.walmart.demo.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PriceInfo {

    @SerializedName("originalPrice")
    @Expose
    private Integer originalPrice;
    @SerializedName("eventCode")
    @Expose
    private String eventCode;
    @SerializedName("specialPrice")
    @Expose
    private Integer specialPrice;
    @SerializedName("promotionEvent")
    @Expose
    private String promotionEvent;

    public Integer getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    public Integer getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(Integer specialPrice) {
        this.specialPrice = specialPrice;
    }

    public String getPromotionEvent() {
        return promotionEvent;
    }

    public void setPromotionEvent(String promotionEvent) {
        this.promotionEvent = promotionEvent;
    }

}
