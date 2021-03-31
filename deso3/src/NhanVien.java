/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class NhanVien extends Person {

    protected String PB;
    protected float HSL, TN, LCB, LTL;

    public NhanVien() {
    }

    public NhanVien(String PB, float HSL, float TN, float LCB, float LTL, String HT, String NS, String DC, String GT) {
        super(HT, NS, DC, GT);
        this.PB = PB;
        this.HSL = HSL;
        this.TN = TN;
        this.LCB = LCB;
        this.LTL = LTL;
    }

    public String getPB() {
        return PB;
    }

    public void setPB(String PB) {
        this.PB = PB;
    }

    public float getHSL() {
        return HSL;
    }

    public void setHSL(float HSL) {
        this.HSL = HSL;
    }

    public float getTN() {
        return TN;
    }

    public void setTN(float TN) {
        this.TN = TN;
    }

    public float getLCB() {
        return LCB;
    }

    public void setLCB(float LCB) {
        this.LCB = LCB;
    }

    public float getLTL() {
        return LTL;
    }

    public void setLTL(float LTL) {
        this.LTL = LTL;
    }

    @Override
    public String toString() {
        return super.toString() + "$" + PB + "$" + HSL + "$" + TN + "$" + LCB + "$" + LTL; //To change body of generated methods, choose Tools | Templates.
    }

}
