package com.company;

public class Main {

    public static void main(String[] args) {
        // start soru41
        Main.asalSayıMı(7);
        // end soru41
        // start soru42
        //yontem1
        Main.faktoryel(5);
        //yontem2
        int sonuc = Main.recFactoryel(5);
        System.out.println("sonuc "+ sonuc);
        // start soru42
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
        if (isAsal) {
            System.out.println(sayı + " sayısı Evet asal sayıdır");
        } else {
            System.out.println(sayı + " sayısı Hayır asal sayı degildir");
        }


    }
    public static void faktoryel(int sayı) {
        // 5*4*3*2*1
        //1*2*3*4*5
        int sonuc=1;
        for (int i = 1; i <=sayı ; i++) {
            sonuc=sonuc*i;
        }
        System.out.println(sayı+"! = " + sonuc);
    }
    public static int recFactoryel(int i){
        if(i==1){
            return 1;
        }
        else {
            return (i*(recFactoryel(i-1)));
        }
    }

}
