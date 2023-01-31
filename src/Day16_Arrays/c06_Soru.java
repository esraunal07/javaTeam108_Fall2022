package Day16_Arrays;

import java.util.Arrays;

public class c06_Soru {
    public static void main(String[] args) {

        //Bir marketin fiyatlarini tutan bir array var.
        // bu marketteki en yuksek ve en dusuk fiyatlari yazdiran bir method olusturun.

        double[] fiyatlar = {23,34.5,42.1,5.7,3.4,23.5} ;
        enYuksekEndusukFiyatYazdir(fiyatlar);
    }

    public static void enYuksekEndusukFiyatYazdir(double[]fiyatlar) {

        double enDusukFiyat=fiyatlar[0];
        double enYuksekFiyat=fiyatlar[0] ;

        for (int i = 0; i <fiyatlar.length; i++) {


          if (fiyatlar[i] < enDusukFiyat) {
            enDusukFiyat=fiyatlar[i] ;

        }
        if (fiyatlar[i]> enYuksekFiyat) {
            enYuksekFiyat=fiyatlar[i];
        }
        }
        System.out.println("En dusuk fiyat:" + enDusukFiyat);
        System.out.println("En yuksek fiyat:" + enYuksekFiyat);
    }
}
