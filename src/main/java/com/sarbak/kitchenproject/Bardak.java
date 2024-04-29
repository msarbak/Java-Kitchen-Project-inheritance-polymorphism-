/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sarbak.kitchenproject;

/**
 *
 * @author mehmetsarbak
 */
public class Bardak {
    
    private int kapasite;
    private String malzeme;

    public Bardak(int kapasite, String malzeme) {
        this.kapasite = kapasite;
        this.malzeme = malzeme;
    }
    
    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    public String getMalzeme() {
        return malzeme;
    }

    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }
    
    public void kullan(int icmeMiktari) {
        kapasite -= icmeMiktari;
        System.out.println("\n\ncay icildi..\n\n");
    }
    
    public void ekle(int eklemeMiktari) {
        kapasite += eklemeMiktari;
        System.out.println("\n\ncay katildi..\n\n");
    }
    public void bilgileriGoster(){
        System.out.println("\nBARDAK BILGISI\n");
        System.out.println("kapasite: " + kapasite + " ml");
        System.out.println("malzeme: " + malzeme);
    }
}
