/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deso6;

/**
 *
 * @author ASUS
 */
public class Word {

    protected String id, en, vn;

    public Word() {
    }

    public Word(String id, String en, String vn) {
        this.id = id;
        this.en = en;
        this.vn = vn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    @Override
    public String toString() {
        return "Word{" + "id=" + id + ", en=" + en + ", vnString=" + vn + '}';
    }

}
