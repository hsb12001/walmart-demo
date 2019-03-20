
package mx.shosvb.walmart.demo.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class _45 {

    @SerializedName("attrGroupId")
    @Expose
    private String attrGroupId;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("attrOrder")
    @Expose
    private Integer attrOrder;
    @SerializedName("attrName")
    @Expose
    private String attrName;
    @SerializedName("attrDesc")
    @Expose
    private String attrDesc;

    public String getAttrGroupId() {
        return attrGroupId;
    }

    public void setAttrGroupId(String attrGroupId) {
        this.attrGroupId = attrGroupId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getAttrOrder() {
        return attrOrder;
    }

    public void setAttrOrder(Integer attrOrder) {
        this.attrOrder = attrOrder;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrDesc() {
        return attrDesc;
    }

    public void setAttrDesc(String attrDesc) {
        this.attrDesc = attrDesc;
    }

}
