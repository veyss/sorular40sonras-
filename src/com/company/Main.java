package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // start soru41
        /*
        Main.asalSayıMı(7);
        */

        // end soru41
        // start soru42
        //yontem1
        /*
        Main.faktoryel(5);


        //yontem2
        int sonuc = Main.recFactoryel(5);
        System.out.println("sonuc " + sonuc);
         */

        // start soru42

        // start soru 43
        /*
        //https://tugrulbayrak.medium.com/search-arama-algoritmalari-binary-linear-5260431ba9a3
        int sayılarım [] ={2,8,9,78,98,100,122,130};
        int arananSayı = 99;
       int sonucIndex= Main.binarySearch(sayılarım, arananSayı);
       if(sonucIndex==-1){
           System.out.println("Verilen arrayde " + arananSayı + " degeri yoktur" );
       }
       else {
           System.out.println("Aranan "+ arananSayı + " sayı " + sonucIndex +".  indextedir");
       }
        //end soru 43
        */
       // start soru44
        /*
        int sayılarım44 [] ={140,29,8,91,78,98,10,2,130};
        Main.enBuyukIkiSayıyıYaz(sayılarım44);
         */
       // end soru44

        // start soru45
        int sayılarım45 [] ={140,29,8,91,78,98,10,2,130};
        Main.arrayValueKarıştır(sayılarım45);
        // end soru45

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
        int sonuc = 1;
        for (int i = 1; i <= sayı; i++) {
            sonuc = sonuc * i;
        }
        System.out.println(sayı + "! = " + sonuc);
    }

    public static int recFactoryel(int i) {
        if (i == 1) {
            return 1;
        } else {
            return (i * (recFactoryel(i - 1)));
        }
    }

    public static int binarySearch(int[] array, int arananSayı) {
        //  int sayılarım [] ={2,8,9,78,98,100,122,130};
        //    int arananSayı = 9;
        int solIndex = 0;
        int sagIndex = array.length - 1;
        int ortaIndex = (solIndex + sagIndex) / 2;
        while (solIndex <= sagIndex) {
            // orta indexdeki degerin aranan sayıdan kucuk olması
            if (array[ortaIndex] < arananSayı) {
                solIndex = ortaIndex + 1;
            } else if (array[ortaIndex] > arananSayı) {
                // orta indexdeki degerin aranan sayıdan buyuk olması
                sagIndex = ortaIndex - 1;
            } else if (array[ortaIndex] == arananSayı) {
                //aranan deger orta indexdeki degeri esit ise
                return ortaIndex;
            } else {
                // aranan deger arrayde yok ise
               return -1;
            }
            ortaIndex = (solIndex + sagIndex) / 2;
        }

        return -1;
    }
    public static void enBuyukIkiSayıyıYaz(int [] array){
     // int sayılarım44 [] ={29,8,91,78,98,10,2,130};
     int enYuksekSayı1=0;
     int enYuksekSayı2=0;
        for (int value:array) {
            if(value>enYuksekSayı1){
                enYuksekSayı2=enYuksekSayı1;
                enYuksekSayı1=value;
            }
            else if(value>enYuksekSayı2){
                enYuksekSayı2=value;
            }
        }
        System.out.println("Arraydeki en buyuk deger = " + enYuksekSayı1);
        System.out.println("Arraydeki 2. en buyuk deger = " + enYuksekSayı2);

    }
    public static void arrayValueKarıştır(int[]array){
     // int sayılarım45 [] ={140,29,8,91,78,98,10,2,130};
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int rastgele= random.nextInt(array.length); //0 ile 9 arasında deger uretiyor // 9 dahil degil

            int rastgeleIndextekiSayı= array[rastgele];
            array[rastgele]=array[i];
            array[i]=rastgeleIndextekiSayı;
        }
        System.out.println(Arrays.toString(array));
    }
}
