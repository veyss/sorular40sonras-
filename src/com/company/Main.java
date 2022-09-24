package com.company;

public class Main {

    public static void main(String[] args) {
        Main.asalSayıMı(7);
    }

    public static void asalSayıMı(int sayı) {
        // asal sayı = sadece kendisi ve 1 e bolunen sayılardır
        // isAsal True ise sayımız asaldır olsun
        boolean isAsal = true;
        for (int i = 2; i < sayı; i++) {
            if (sayı % i == 0) {
                isAsal = false;
                break;
            }
        }
        if(isAsal){
            System.out.println(sayı + " sayısı Evet asal sayıdır");
        }
        else {
            System.out.println(sayı + " sayısı Hayır asal sayı degildir");
        }


    }

}
