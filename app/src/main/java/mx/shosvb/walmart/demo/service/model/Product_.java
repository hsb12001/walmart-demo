
package mx.shosvb.walmart.demo.service.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product_ {

    @SerializedName("childSKUs")
    @Expose
    private List<ChildSKU> childSKUs = null;
    @SerializedName("longDescription")
    @Expose
    private String longDescription;
    @SerializedName("smallImageUrl")
    @Expose
    private String smallImageUrl;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("productStatus")
    @Expose
    private String productStatus;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("negotiations")
    @Expose
    private List<String> negotiations = null;
    @SerializedName("seoKeywords")
    @Expose
    private List<String> seoKeywords = null;
    @SerializedName("metaDescription")
    @Expose
    private String metaDescription;
    @SerializedName("productIcons")
    @Expose
    private ProductIcons productIcons;
    @SerializedName("maxMSI")
    @Expose
    private Integer maxMSI;
    @SerializedName("thumbnailImageUrl")
    @Expose
    private String thumbnailImageUrl;
    @SerializedName("isBulkBundle")
    @Expose
    private Boolean isBulkBundle;
    @SerializedName("breadcrumb")
    @Expose
    private Breadcrumb breadcrumb;
    @SerializedName("bannerDetails")
    @Expose
    private BannerDetails bannerDetails;
    @SerializedName("metaTitle")
    @Expose
    private String metaTitle;
    @SerializedName("largeImageUrl")
    @Expose
    private String largeImageUrl;
    @SerializedName("repositoryId")
    @Expose
    private String repositoryId;
    @SerializedName("productSeoUrl")
    @Expose
    private String productSeoUrl;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("isGiftListProduct")
    @Expose
    private Boolean isGiftListProduct;

    public List<ChildSKU> getChildSKUs() {
        return childSKUs;
    }

    public void setChildSKUs(List<ChildSKU> childSKUs) {
        this.childSKUs = childSKUs;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getNegotiations() {
        return negotiations;
    }

    public void setNegotiations(List<String> negotiations) {
        this.negotiations = negotiations;
    }

    public List<String> getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(List<String> seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public ProductIcons getProductIcons() {
        return productIcons;
    }

    public void setProductIcons(ProductIcons productIcons) {
        this.productIcons = productIcons;
    }

    public Integer getMaxMSI() {
        return maxMSI;
    }

    public void setMaxMSI(Integer maxMSI) {
        this.maxMSI = maxMSI;
    }

    public String getThumbnailImageUrl() {
        return thumbnailImageUrl;
    }

    public void setThumbnailImageUrl(String thumbnailImageUrl) {
        this.thumbnailImageUrl = thumbnailImageUrl;
    }

    public Boolean getIsBulkBundle() {
        return isBulkBundle;
    }

    public void setIsBulkBundle(Boolean isBulkBundle) {
        this.isBulkBundle = isBulkBundle;
    }

    public Breadcrumb getBreadcrumb() {
        return breadcrumb;
    }

    public void setBreadcrumb(Breadcrumb breadcrumb) {
        this.breadcrumb = breadcrumb;
    }

    public BannerDetails getBannerDetails() {
        return bannerDetails;
    }

    public void setBannerDetails(BannerDetails bannerDetails) {
        this.bannerDetails = bannerDetails;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public String getProductSeoUrl() {
        return productSeoUrl;
    }

    public void setProductSeoUrl(String productSeoUrl) {
        this.productSeoUrl = productSeoUrl;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Boolean getIsGiftListProduct() {
        return isGiftListProduct;
    }

    public void setIsGiftListProduct(Boolean isGiftListProduct) {
        this.isGiftListProduct = isGiftListProduct;
    }

}
