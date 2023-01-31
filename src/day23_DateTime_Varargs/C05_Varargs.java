package day23_DateTime_Varargs;

public class C05_Varargs {
    public static void main(String[] args) {

        // Verilen 2 sayiyi toplayip yazdiran bir method olusturun

        topla(5,8); //13
        topla(5,7,3); //15
        topla(8,3,2); //13
        topla(7,3,4,6); //20
    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("4 Sayinin toplami :" + (sayi1+sayi2+sayi3+sayi4)); //20
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("3 sayinin toplami :" + (sayi1+sayi2+sayi3)); //15
    }

    private static void topla(int sayi1, int sayi2) {
        System.out.println("2sayinin toplami :" +(sayi1+sayi2)); //13
    }
}
