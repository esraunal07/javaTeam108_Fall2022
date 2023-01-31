package day08_stringManipulation;

import java.util.Random;

public class c06_Length {

    public static void main(String[] args) {
        String str="Java her gecen gun daha da guzellesiyor, degil mi?" ;

        //sondan 3. karakteri yazdirin

        System.out.println(str.charAt(str.length()-3));

        System.out.println(str.length());

        // rastgele bir karakterini yazdiralim
        Random rnd= new Random() ;  //rnd degeri icin 0 ile 1 arasinda rastgele bir deger olusturu
        int index= rnd.nextInt(str.length()) ; // str.lenght den kucuk rastgele bir int uretir

        System.out.println(str.charAt(index));

    }
}
