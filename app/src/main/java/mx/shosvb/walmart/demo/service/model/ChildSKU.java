
package mx.shosvb.walmart.demo.service.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChildSKU {

    @SerializedName("longDescription")
    @Expose
    private String longDescription;
    @SerializedName("bundleLinks")
    @Expose
    private List<Object> bundleLinks = null;
    @SerializedName("dynamicFacets")
    @Expose
    private DynamicFacets dynamicFacets;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("isPreOrderable")
    @Expose
    private Boolean isPreOrderable;
    @SerializedName("isOnDemand")
    @Expose
    private Boolean isOnDemand;
    @SerializedName("itemHeight")
    @Expose
    private Double itemHeight;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("videoId")
    @Expose
    private List<Object> videoId = null;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("thumbnailImageUrl")
    @Expose
    private String thumbnailImageUrl;
    @SerializedName("itemWidth")
    @Expose
    private Integer itemWidth;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("itemWeight")
    @Expose
    private Double itemWeight;
    @SerializedName("rightLargeImageUrl")
    @Expose
    private String rightLargeImageUrl;
    @SerializedName("superiorLargeImageUrl")
    @Expose
    private String superiorLargeImageUrl;
    @SerializedName("smallImageUrl")
    @Expose
    private String smallImageUrl;
    @SerializedName("isBigItem")
    @Expose
    private Boolean isBigItem;
    @SerializedName("seoDescription")
    @Expose
    private String seoDescription;
    @SerializedName("skuStatus")
    @Expose
    private String skuStatus;
    @SerializedName("upc")
    @Expose
    private String upc;
    @SerializedName("itemLength")
    @Expose
    private Integer itemLength;
    @SerializedName("vendorName")
    @Expose
    private String vendorName;
    @SerializedName("leftLargeImageUrl")
    @Expose
    private String leftLargeImageUrl;
    @SerializedName("sellingAtStore")
    @Expose
    private Boolean sellingAtStore;
    @SerializedName("formatId")
    @Expose
    private String formatId;
    @SerializedName("auxiliaryMedia")
    @Expose
    private AuxiliaryMedia auxiliaryMedia;
    @SerializedName("largeImageUrl")
    @Expose
    private String largeImageUrl;
    @SerializedName("parentUpc")
    @Expose
    private String parentUpc;
    @SerializedName("offerList")
    @Expose
    private List<OfferList> offerList = null;

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public List<Object> getBundleLinks() {
        return bundleLinks;
    }

    public void setBundleLinks(List<Object> bundleLinks) {
        this.bundleLinks = bundleLinks;
    }

    public DynamicFacets getDynamicFacets() {
        return dynamicFacets;
    }

    public void setDynamicFacets(DynamicFacets dynamicFacets) {
        this.dynamicFacets = dynamicFacets;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Boolean getIsPreOrderable() {
        return isPreOrderable;
    }

    public void setIsPreOrderable(Boolean isPreOrderable) {
        this.isPreOrderable = isPreOrderable;
    }

    public Boolean getIsOnDemand() {
        return isOnDemand;
    }

    public void setIsOnDemand(Boolean isOnDemand) {
        this.isOnDemand = isOnDemand;
    }

    public Double getItemHeight() {
        return itemHeight;
    }

    public void setItemHeight(Double itemHeight) {
        this.itemHeight = itemHeight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Object> getVideoId() {
        return videoId;
    }

    public void setVideoId(List<Object> videoId) {
        this.videoId = videoId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getThumbnailImageUrl() {
        return thumbnailImageUrl;
    }

    public void setThumbnailImageUrl(String thumbnailImageUrl) {
        this.thumbnailImageUrl = thumbnailImageUrl;
    }

    public Integer getItemWidth() {
        return itemWidth;
    }

    public void setItemWidth(Integer itemWidth) {
        this.itemWidth = itemWidth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(Double itemWeight) {
        this.itemWeight = itemWeight;
    }

    public String getRightLargeImageUrl() {
        return rightLargeImageUrl;
    }

    public void setRightLargeImageUrl(String rightLargeImageUrl) {
        this.rightLargeImageUrl = rightLargeImageUrl;
    }

    public String getSuperiorLargeImageUrl() {
        return superiorLargeImageUrl;
    }

    public void setSuperiorLargeImageUrl(String superiorLargeImageUrl) {
        this.superiorLargeImageUrl = superiorLargeImageUrl;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    public Boolean getIsBigItem() {
        return isBigItem;
    }

    public void setIsBigItem(Boolean isBigItem) {
        this.isBigItem = isBigItem;
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    public String getSkuStatus() {
        return skuStatus;
    }

    public void setSkuStatus(String skuStatus) {
        this.skuStatus = skuStatus;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public Integer getItemLength() {
        return itemLength;
    }

    public void setItemLength(Integer itemLength) {
        this.itemLength = itemLength;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getLeftLargeImageUrl() {
        return leftLargeImageUrl;
    }

    public void setLeftLargeImageUrl(String leftLargeImageUrl) {
        this.leftLargeImageUrl = leftLargeImageUrl;
    }

    public Boolean getSellingAtStore() {
        return sellingAtStore;
    }

    public void setSellingAtStore(Boolean sellingAtStore) {
        this.sellingAtStore = sellingAtStore;
    }

    public String getFormatId() {
        return formatId;
    }

    public void setFormatId(String formatId) {
        this.formatId = formatId;
    }

    public AuxiliaryMedia getAuxiliaryMedia() {
        return auxiliaryMedia;
    }

    public void setAuxiliaryMedia(AuxiliaryMedia auxiliaryMedia) {
        this.auxiliaryMedia = auxiliaryMedia;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    public String getParentUpc() {
        return parentUpc;
    }

    public void setParentUpc(String parentUpc) {
        this.parentUpc = parentUpc;
    }

    public List<OfferList> getOfferList() {
        return offerList;
    }

    public void setOfferList(List<OfferList> offerList) {
        this.offerList = offerList;
    }

}
