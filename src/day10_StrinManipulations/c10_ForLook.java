package day10_StrinManipulations;

public class c10_ForLook {
    public static void main(String[] args) {
        // input olarak verilen sayidan baslayarak
        // 7'ser 7'ser arttirarak input olarak verilen bitis sayisana kadar
        // tum sayilari
        //kac adet sayi oldugunu
        // ve bu sayilarin toplaminin kac oldugunu yazdirin

        int inputbas=34;
        int inputbit=563;
        int sayac =1;
        int toplam=0;

        for (int i = inputbas; i <=inputbit ; i+=7) {
            System.out.println(i + " ");
            sayac++;
            toplam+=i;

            System.out.println("");
            System.out.println("toplam" + sayac + " adet sayi var \nBu sayilarin toplami : " + toplam );
        }
    }
}
