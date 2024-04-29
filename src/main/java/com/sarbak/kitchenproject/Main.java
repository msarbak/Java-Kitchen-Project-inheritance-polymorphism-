package com.sarbak.kitchenproject;

import java.util.Scanner;

/**
 *
 * @author mehmetsarbak
 */
public class Main {

    public static void main(String[] args) {
        
        Bardak cayBardagi = new CayBardagi(500, "cam", 200); 
        Bardak kahveFincani = new KahveFincani(500, "porselen", 200);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n\nPROGRAM BASLATILDI\n\n");
        System.out.println("BARDAK SECIN\n");
        System.out.println("1. Cay bardagi\n" + "2. Kahve Fincani\n" + "Cikis icin q\n");
        
        while(cayBardagi.getKapasite() >= 0 || kahveFincani.getKapasite() >= 0) {
            System.out.println("islem seciniz..");
            String islem = scanner.nextLine();
            if(islem.equals("q")) {
                System.out.println("programdan cikiliyor..");
                break;
            } 
            else {
                if(islem.equals("1")) {
                    System.out.println("CAY BARDAGI SECILDI");
                    cayBardagi.bilgileriGoster();
                    
                    while(cayBardagi.getKapasite() >= 0) {
                        String islemler = "\n\n\nislemler: \n" + "1. Cay icin\n" + "2. Cay dokun\n" + "onceki menu icin q ya basin\n"; 
                        System.out.println(islemler);
                        System.out.println("islem seciniz..");
                        String islemm = scanner.nextLine();
                        if(islemm.equals("q")) {
                            System.out.println("onceki menuye donuluyor..");
                            break;
                        } 
                        else if(islemm.equals("1")) {
                            System.out.println("ne kadar cay iceceksiniz?");
                            int cayIc = scanner.nextInt(); 
                            scanner.nextLine();
                            cayBardagi.kullan(cayIc);
                            cayBardagi.bilgileriGoster();
                           } 
                        else if (islemm.equals("2")) {
                            System.out.println("ne kadar cay ekleyeceksiniz?");
                            int cayIc = scanner.nextInt(); 
                            scanner.nextLine();
                            cayBardagi.ekle(cayIc);
                            cayBardagi.bilgileriGoster();
                        } 
                        else {
                            System.out.println("gecersiz islem");
                        }
                    }
                } 
                else if (islem.equals("2")) {
                    System.out.println("KAHVE FINCANI SECILDI");
                    kahveFincani.bilgileriGoster();
                    
                    while(kahveFincani.getKapasite() >= 0) {
                        String islemler = "\n\n\nislemler: \n" + "1. Kahve icin\n" + "2. Kahve dokun\n" + "onceki menu icin q ya basin\n"; 
                        System.out.println(islemler);
                        System.out.println("islem seciniz..");
                        String islemm = scanner.nextLine();
                        if(islemm.equals("q")) {
                            System.out.println("onceki menuye donuluyor..");
                            break;
                        } 
                        else if(islemm.equals("1")) {
                            System.out.println("ne kadar cay iceceksiniz?");
                            int kahveIc = scanner.nextInt(); 
                            scanner.nextLine();
                            kahveFincani.kullan(kahveIc);
                            cayBardagi.bilgileriGoster();
                           } 
                        else if (islemm.equals("2")) {
                            System.out.println("ne kadar cay ekleyeceksiniz?");
                            int kahveIc = scanner.nextInt(); 
                            scanner.nextLine();
                            kahveFincani.ekle(kahveIc);
                            kahveFincani.bilgileriGoster();
                        } 
                        else {
                            System.out.println("gecersiz islem");
                        }
                    }
                    
                } 
                else {
                    System.out.println("gecersiz islem");
                }
            }
        }
        
    }

}
