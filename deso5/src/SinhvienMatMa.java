/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class SinhvienMatMa extends Sinhvien {

    protected String DV, Luong;

    public SinhvienMatMa() {
    }

    public SinhvienMatMa(String DV, String Luong, String HT, String NS, String GT, String MSV, String DTB) {
        super(HT, NS, GT, MSV, DTB);
        this.DV = DV;
        this.Luong = Luong;
    }

    public String getDV() {
        return DV;
    }

    public void setDV(String DV) {
        this.DV = DV;
    }

    public String getLuong() {
        return Luong;
    }

    public void setLuong(String Luong) {
        this.Luong = Luong;
    }

    @Override
    public String toString() {
        return super.toString() + ", DV = " + DV + ", Luong = " + Luong; //To change body of generated methods, choose Tools | Templates.
    }

}
