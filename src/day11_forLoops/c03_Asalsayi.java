package day11_forLoops;

public class c03_Asalsayi {
    public static void main(String[] args) {

        // input olarak verilen bir tam sayinin asal sayi olup olmadigini yazdirin.

        int input = 19;
        String sonuc="Sayi Asal" ;

        for (int i = 2; i < input; i++) {


            if (input % i == 0) {
                sonuc="Sayi asal degil" ;
               //  break;
                // java bir loopun icerisinde 'break' gorurse o loopu bitirir.

            }


        }
        System.out.println(sonuc);
    }
}
