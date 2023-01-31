package day11_forLoops;

import java.util.Scanner;

public class c05_ForLoop {
    public static void main(String[] args) {
        /*Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */

        Scanner scan=new Scanner(System.in) ;
        System.out.println("Lutfen baslangic ve bitis degrleri icin iki pozitif tamsayi giriniz");

        int baslangic= scan.nextInt();
        int bitis= scan.nextInt();

        if (bitis<baslangic){
            System.out.println("Baslangic degeri bitis degerinden kucuk olmali");
        } else{
            int toplam=0;
            for (int i = baslangic; i <=bitis ; i++) {
                toplam += i; // tum sayilari sirasiyla toplma ekledik

                System.out.println(baslangic +" ile" + bitis + "arasindaki sayilarin toplami: " +toplam);


            }
        }




    }
}
