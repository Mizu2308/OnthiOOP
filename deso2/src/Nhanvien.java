/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Nhanvien extends Person {

    protected String PB;
    protected double HSL, TN, LCB, LTL;

    public Nhanvien(String PB, double HSL, double TN, double LCB, double LTL, String HT, String NS, String DC, String GT) {
        super(HT, NS, DC, GT);
        this.PB = PB;
        this.HSL = HSL;
        this.TN = TN;
        this.LCB = LCB;
        this.LTL = LTL;
    }

    public Nhanvien() {
    }

    public String getPB() {
        return PB;
    }

    public void setPB(String PB) {
        this.PB = PB;
    }

    public double getHSL() {
        return HSL;
    }

    public void setHSL(double HSL) {
        this.HSL = HSL;
    }

    public double getTN() {
        return TN;
    }

    public void setTN(double TN) {
        this.TN = TN;
    }

    public double getLCB() {
        return LCB;
    }

    public void setLCB(double LCB) {
        this.LCB = LCB;
    }

    public double getLTL() {
        return LTL;
    }

    public void setLTL(double LTL) {
        this.LTL = LTL;
    }

    @Override
    public String toString() {
        return super.toString() + "PB=" + PB + ", HSL=" + HSL + ", TN=" + TN + ", LCB=" + LCB + ", LTL=" + LTL; //To change body of generated methods, choose Tools | Templates.
    }

}
