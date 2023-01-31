package day33_Maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C05_SoyisimleriBuyuhHarfleYazdirma {

    public static void main(String[] args) {

        //Verilen bolumdeki ogrencilerin no, isim-soyisim ve siniflarini yazdiran method olusturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap= MapMethodDepo.soyisimleriBuyukHarfYap(ogrenciMap);

        MapMethodDepo.tumListeYazdir(ogrenciMap);

        // 11.siniflari yazdir

        MapMethodDepo.sinifListesiYazdirma(ogrenciMap,"11");
    }
}
