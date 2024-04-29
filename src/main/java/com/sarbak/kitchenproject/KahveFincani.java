package com.sarbak.kitchenproject;

/**
 *
 * @author mehmetsarbak
 */
public class KahveFincani extends Bardak{
    private int agirlik;
    public KahveFincani(int kapasite, String malzeme, int agirlik) {
        super(kapasite, malzeme);
        this.agirlik = agirlik;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    @Override
    public void ekle(int eklemeMiktari) {
       if(eklemeMiktari + super.getKapasite() > 500) {
            System.out.println("\n\nfincan tasti...\n\n");
            super.setKapasite(500);
            
        }
        if(eklemeMiktari > 500) System.out.println("\n\fincan 500 ml alir...\n\n");
        if(eklemeMiktari + super.getKapasite() <= 500) {
            int kapasite = super.getKapasite() + eklemeMiktari;
            super.setKapasite(kapasite);
            System.out.println("\n\nkahve katildi..\n\n");
        }
    }

    @Override
    public void kullan(int icmeMiktari) {
        if (super.getKapasite() - icmeMiktari < 0) {
            super.setKapasite(0);
            System.out.println("\n\nLutfen kahve ekleyin. icilecek kahve kalmadi..\n\n");
        }
        else {
            int miktar = super.getKapasite() - icmeMiktari;
            super.setKapasite(miktar);
            System.out.println("\n\nkahve icildi..\n\n");
        }    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Bardak turu: Kahve bardagi");
    }
    
}
