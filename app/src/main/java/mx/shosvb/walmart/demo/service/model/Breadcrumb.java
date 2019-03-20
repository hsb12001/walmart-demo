
package mx.shosvb.walmart.demo.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Breadcrumb {

    @SerializedName("familyId")
    @Expose
    private String familyId;
    @SerializedName("departmentName")
    @Expose
    private String departmentName;
    @SerializedName("familyName")
    @Expose
    private String familyName;
    @SerializedName("departmentId")
    @Expose
    private String departmentId;
    @SerializedName("fineLineName")
    @Expose
    private String fineLineName;
    @SerializedName("fineLineId")
    @Expose
    private String fineLineId;

    public String getFamilyId() {
        return familyId;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getFineLineName() {
        return fineLineName;
    }

    public void setFineLineName(String fineLineName) {
        this.fineLineName = fineLineName;
    }

    public String getFineLineId() {
        return fineLineId;
    }

    public void setFineLineId(String fineLineId) {
        this.fineLineId = fineLineId;
    }

}
