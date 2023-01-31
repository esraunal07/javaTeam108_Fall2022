package day18_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class C10_Soru {
    public static void main(String[] args) {
        // kullanicinin istedigi kadar isim alip,
        //Q'ya bastiginda giridigi isimleri bize liste olarak dondurecek  bir method olusturun.

        List<String> isimlerListesi = isimListesiOlustur();
        System.out.println(isimlerListesi);


    }

    public static List<String> isimListesiOlustur() {

        List<String> isimListesi = new ArrayList<>();

        String girilenisim = "";
        Scanner scan = new Scanner(System.in);

        while (!girilenisim.equalsIgnoreCase("q")) {

            System.out.println("Listeye eklemek icin bir isim girin\nbitirmek icin q ya basin");
            girilenisim = scan.nextLine();
            if (!girilenisim.equalsIgnoreCase("q")) {
                isimListesi.add(girilenisim);
            }

        }
        return isimListesi;
    }

}
