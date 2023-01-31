package day18_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class C11_Soru {
    public static void main(String[] args) {

        /*
        Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
        kalan kismini list olarak bize donduren bir method olusturun
         */
        List<String> isimler= C10_Soru.isimListesiOlustur();
        System.out.println("Istenmeyen harfin oldugu isimler silindi\nKalan isimler: " + istenmeyenisimleriSil(isimler));

    }

    public static List<String> istenmeyenisimleriSil(List<String> isimler){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iceren isimleri silmek icin bir harf giriniz");
        String istenmeyenharf=scan.next().substring(0,1);

        List<String> yeniliste=new ArrayList<>();
        for (int i = 0; i <isimler.size() ; i++) {
         if   (!isimler.get(i).contains(istenmeyenharf)){
             yeniliste.add(isimler.get(i)) ;
         }


        }
        return yeniliste;
    }
}
