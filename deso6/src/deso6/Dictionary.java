/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deso6;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Dictionary {

    static ArrayList<Word> dict = new ArrayList<>();

    public static void Create_word() {
        Word w1 = new Word("1", "one", "mot");
        dict.add(w1);
        w1 = new Word("2", "two", "hai");
        dict.add(w1);
        w1 = new Word("3", "three", "ba");
        dict.add(w1);
        w1 = new Word("4", "four", "bon");
        dict.add(w1);
        w1 = new Word("5", "five", "nam");
        dict.add(w1);
        w1 = new Word("6", "six", "sau");
        dict.add(w1);
        w1 = new Word("7", "seven", "bay");
        dict.add(w1);
        w1 = new Word("8", "eight", "tam");
        dict.add(w1);
        w1 = new Word("9", "nine", "chin");
        dict.add(w1);
        w1 = new Word("10", "ten", "muoi");
        dict.add(w1);
    }

    public static String ENtoVN(String enfind) {
        for (int i = 0; i < dict.size(); i++) {
            if (enfind.equalsIgnoreCase(dict.get(i).getEn())) {
                return dict.get(i).getVn().toString();
            }
        }
        return "";
    }

    public static String VNtoEN(String enfind) {
        for (int i = 0; i < dict.size(); i++) {
            if (enfind.equalsIgnoreCase(dict.get(i).getVn())) {
                return dict.get(i).getEn().toString();
            }
        }
        return "";
    }

    public static void addWord(String enString, String vnString) {
        int i = 0;
        for (int j = 0; j < dict.size(); j++) {
            i++;
        }
        Word w = new Word(String.valueOf(i + 1), enString, vnString);
        dict.add(w);

        System.out.println(dict.get(i).toString());

    }
}
