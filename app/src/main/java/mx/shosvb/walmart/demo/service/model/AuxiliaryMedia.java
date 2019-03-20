
package mx.shosvb.walmart.demo.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuxiliaryMedia {

    @SerializedName("MEDIUM")
    @Expose
    private MEDIUM mEDIUM;
    @SerializedName("SUPERIOR_ICON")
    @Expose
    private SUPERIORICON sUPERIORICON;
    @SerializedName("LEFT_MEDIUM")
    @Expose
    private LEFTMEDIUM lEFTMEDIUM;
    @SerializedName("RIGHT_MEDIUM")
    @Expose
    private RIGHTMEDIUM rIGHTMEDIUM;
    @SerializedName("ICON")
    @Expose
    private ICON iCON;
    @SerializedName("LEFT_ICON")
    @Expose
    private LEFTICON lEFTICON;
    @SerializedName("RIGHT_ICON")
    @Expose
    private RIGHTICON rIGHTICON;
    @SerializedName("SUPERIOR_MEDIUM")
    @Expose
    private SUPERIORMEDIUM sUPERIORMEDIUM;

    public MEDIUM getMEDIUM() {
        return mEDIUM;
    }

    public void setMEDIUM(MEDIUM mEDIUM) {
        this.mEDIUM = mEDIUM;
    }

    public SUPERIORICON getSUPERIORICON() {
        return sUPERIORICON;
    }

    public void setSUPERIORICON(SUPERIORICON sUPERIORICON) {
        this.sUPERIORICON = sUPERIORICON;
    }

    public LEFTMEDIUM getLEFTMEDIUM() {
        return lEFTMEDIUM;
    }

    public void setLEFTMEDIUM(LEFTMEDIUM lEFTMEDIUM) {
        this.lEFTMEDIUM = lEFTMEDIUM;
    }

    public RIGHTMEDIUM getRIGHTMEDIUM() {
        return rIGHTMEDIUM;
    }

    public void setRIGHTMEDIUM(RIGHTMEDIUM rIGHTMEDIUM) {
        this.rIGHTMEDIUM = rIGHTMEDIUM;
    }

    public ICON getICON() {
        return iCON;
    }

    public void setICON(ICON iCON) {
        this.iCON = iCON;
    }

    public LEFTICON getLEFTICON() {
        return lEFTICON;
    }

    public void setLEFTICON(LEFTICON lEFTICON) {
        this.lEFTICON = lEFTICON;
    }

    public RIGHTICON getRIGHTICON() {
        return rIGHTICON;
    }

    public void setRIGHTICON(RIGHTICON rIGHTICON) {
        this.rIGHTICON = rIGHTICON;
    }

    public SUPERIORMEDIUM getSUPERIORMEDIUM() {
        return sUPERIORMEDIUM;
    }

    public void setSUPERIORMEDIUM(SUPERIORMEDIUM sUPERIORMEDIUM) {
        this.sUPERIORMEDIUM = sUPERIORMEDIUM;
    }

}
