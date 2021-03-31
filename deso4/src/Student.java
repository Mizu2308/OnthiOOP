/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Student extends Person {

    protected String MSV, Email;
    protected float DTK;

    public Student() {
    }

    public Student(String MSV, String Email, float DTK, String HT, String NS, String DC, String GT) {
        super(HT, NS, DC, GT);
        this.MSV = MSV;
        this.Email = Email;
        this.DTK = DTK;
    }

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public float getDTK() {
        return DTK;
    }

    public void setDTK(float DTK) {
        this.DTK = DTK;
    }

    @Override
    public String toString() {
        return super.toString() + "$" + MSV + "$" + Email + "$" + DTK; //To change body of generated methods, choose Tools | Templates.
    }

}
