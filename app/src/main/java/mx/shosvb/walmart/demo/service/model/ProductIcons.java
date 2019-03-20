
package mx.shosvb.walmart.demo.service.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductIcons {

    @SerializedName("freeShippingItem")
    @Expose
    private String freeShippingItem;
    @SerializedName("isBundleItem")
    @Expose
    private Boolean isBundleItem;
    @SerializedName("specialEvent")
    @Expose
    private List<Object> specialEvent = null;
    @SerializedName("isPickupToday")
    @Expose
    private Boolean isPickupToday;

    public String getFreeShippingItem() {
        return freeShippingItem;
    }

    public void setFreeShippingItem(String freeShippingItem) {
        this.freeShippingItem = freeShippingItem;
    }

    public Boolean getIsBundleItem() {
        return isBundleItem;
    }

    public void setIsBundleItem(Boolean isBundleItem) {
        this.isBundleItem = isBundleItem;
    }

    public List<Object> getSpecialEvent() {
        return specialEvent;
    }

    public void setSpecialEvent(List<Object> specialEvent) {
        this.specialEvent = specialEvent;
    }

    public Boolean getIsPickupToday() {
        return isPickupToday;
    }

    public void setIsPickupToday(Boolean isPickupToday) {
        this.isPickupToday = isPickupToday;
    }

}
