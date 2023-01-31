package day31_Collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class C05_Set {
    public static void main(String[] args) {

        //Set index yapisini desteklemez. Yani basi sonu farketmez. siralamayla ilgisi yok.
        //Sadece o kumede var mi yok mu ona odaklanir.

        Set<String> ogrenciler=new TreeSet<>();
        ogrenciler.add("Esra");
        ogrenciler.add("Ayten");
        ogrenciler.add("Furkan");
        System.out.println(ogrenciler); // [Ayten, Esra, Furkan] alfabetik siraya aldi
        ogrenciler.add("Ahmet");
        System.out.println(ogrenciler); //[Ahmet, Ayten, Esra, Furkan]

        ogrenciler.add("Furkan");
        System.out.println(ogrenciler); //[Ahmet, Ayten, Esra, Furkan]


    }
}
