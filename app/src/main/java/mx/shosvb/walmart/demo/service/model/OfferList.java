
package mx.shosvb.walmart.demo.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OfferList {

    @SerializedName("sellerName")
    @Expose
    private String sellerName;
    @SerializedName("length")
    @Expose
    private Integer length;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("weight")
    @Expose
    private Double weight;
    @SerializedName("isInvAvailable")
    @Expose
    private Boolean isInvAvailable;
    @SerializedName("offerRank")
    @Expose
    private Integer offerRank;
    @SerializedName("warrantyInMonths")
    @Expose
    private Integer warrantyInMonths;
    @SerializedName("offerType")
    @Expose
    private String offerType;
    @SerializedName("priceInfo")
    @Expose
    private PriceInfo priceInfo;
    @SerializedName("sellerId")
    @Expose
    private Integer sellerId;
    @SerializedName("refurbished")
    @Expose
    private Boolean refurbished;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("offerId")
    @Expose
    private String offerId;
    @SerializedName("warranty")
    @Expose
    private String warranty;
    @SerializedName("warrantyCondition")
    @Expose
    private String warrantyCondition;
    @SerializedName("height")
    @Expose
    private Double height;

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Boolean getIsInvAvailable() {
        return isInvAvailable;
    }

    public void setIsInvAvailable(Boolean isInvAvailable) {
        this.isInvAvailable = isInvAvailable;
    }

    public Integer getOfferRank() {
        return offerRank;
    }

    public void setOfferRank(Integer offerRank) {
        this.offerRank = offerRank;
    }

    public Integer getWarrantyInMonths() {
        return warrantyInMonths;
    }

    public void setWarrantyInMonths(Integer warrantyInMonths) {
        this.warrantyInMonths = warrantyInMonths;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public PriceInfo getPriceInfo() {
        return priceInfo;
    }

    public void setPriceInfo(PriceInfo priceInfo) {
        this.priceInfo = priceInfo;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Boolean getRefurbished() {
        return refurbished;
    }

    public void setRefurbished(Boolean refurbished) {
        this.refurbished = refurbished;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getWarrantyCondition() {
        return warrantyCondition;
    }

    public void setWarrantyCondition(String warrantyCondition) {
        this.warrantyCondition = warrantyCondition;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

}
