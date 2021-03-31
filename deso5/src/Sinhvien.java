/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Sinhvien {

    protected String HT, NS, GT, MSV, DTB;

    public Sinhvien() {
    }

    public Sinhvien(String HT, String NS, String GT, String MSV, String DTB) {
        this.HT = HT;
        this.NS = NS;
        this.GT = GT;
        this.MSV = MSV;
        this.DTB = DTB;
    }

    public String getHT() {
        return HT;
    }

    public void setHT(String HT) {
        this.HT = HT;
    }

    public String getNS() {
        return NS;
    }

    public void setNS(String NS) {
        this.NS = NS;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getDTB() {
        return DTB;
    }

    public void setDTB(String DTB) {
        this.DTB = DTB;
    }

    @Override
    public String toString() {
        return "HT = " + HT + ", NS = " + NS + ", GT = " + GT + ", MSV = " + MSV + ", DTB = " + DTB;
    }

}
