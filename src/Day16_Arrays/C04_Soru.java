package Day16_Arrays;

import java.security.Signature;
import java.util.Arrays;

public class C04_Soru {
    public static void main(String[] args) {

        // Verilen bir String arrayde
        // istenen bir harfi iceren kelimleri silip, yerine null yazdirin.

        String[] isimler = {"Huseyin", "Yusuf", "Mehmet", "Akile", "Said"};
        String silinecekHarf= "u";

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].contains(silinecekHarf)) {
                isimler[i]=null ;

            }

        }

        System.out.println(Arrays.toString(isimler)); //[null, null, Mehmet, Akile, Said]
    }
}
