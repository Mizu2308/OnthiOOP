/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class SinhvienATTT extends Sinhvien {

    protected String HP;

    public SinhvienATTT() {
    }

    public SinhvienATTT(String HP, String HT, String NS, String GT, String MSV, String DTB) {
        super(HT, NS, GT, MSV, DTB);
        this.HP = HP;
    }

    public String getHP() {
        return HP;
    }

    public void setHP(String HP) {
        this.HP = HP;
    }

    @Override
    public String toString() {
        return super.toString() + ", HP = " + HP; //To change body of generated methods, choose Tools | Templates.
    }

}
