
package deso1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class student extends Person{
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    protected String MSV, emailString;
    protected float DTK;

    public student() {
    }

    public student(String MSV, String emailString, float DTK, String Hoten, String Ngaysinh, String Diachi, String Gioitinh) {
        super(Hoten, Ngaysinh, Diachi, Gioitinh);
        this.MSV = MSV;
        this.emailString = emailString;
        this.DTK = DTK;
    }

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getEmailString() {
        return emailString;
    }

    public void setEmailString(String emailString) {
        this.emailString = emailString;
    }

    public float getDTK() {
        return DTK;
    }

    public void setDTK(float DTK) {
        this.DTK = DTK;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    @Override
    public String toString() {
        return super.toString()+ "MSV=" + MSV + ", emailString=" + emailString + ", DTK=" + DTK ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}


