package day32_sets_maps;

import java.util.Map;

public class C07_SoyisimleOgrenciArama {

    //OgrenciMap'te aradigimiz soyisimdeki
    // ogrencilerin isim, soyisim,sinif ve sube bilgilerini
    // bir tablo olarak yazdiran bir method olusturun-

    public static void main(String[] args) {

        Map<Integer, String > ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.soyisimleOgrenciListesiYazdirma(ogrenciMap,"Cem");

    }
}
