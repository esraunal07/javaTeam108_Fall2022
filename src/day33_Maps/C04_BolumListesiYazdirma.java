package day33_Maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C04_BolumListesiYazdirma {

    public static void main(String[] args) {

        //Verilen bolumdeki ogrencilerin no, isim-soyisim ve siniflarini yazdiran method olusturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        MapMethodDepo.bolumListesiOlusturma(ogrenciMap, "mf");
    }
}
