package day06_Ifelsemethod;

import java.util.Scanner;

public class c08_IfElseIf {
    //Soru 3- Kullanicidan aldigi urun adedi ve
    // ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
    // Musteri karti varsa 10 urunden fazla alirsa %20,
    // yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz");
        int urunadedi= scan.nextInt();

        System.out.println("urunun liste fiyatini giriniz");
        double ListeFiyati= scan.nextDouble();

        System.out.println("Musteri Kartiniz var mi \nE:Evet H:Hayir ");
        char kartVarMi=scan.next().charAt(0);
         if (kartVarMi=='E' && urunadedi>10) {
             System.out.println("%20 indirimli toplam fiyat:"+ urunadedi*ListeFiyati*0.8);
         } else if (kartVarMi=='E' && urunadedi>0) {
             System.out.println("%15 indirimli toplam fiyat:"+ urunadedi*ListeFiyati*0.8);
         } else if (kartVarMi=='H' && urunadedi>0) {
             System.out.println("%10 indirimli toplam fiyat:"+ urunadedi*ListeFiyati*0.8);

         }else{
             System.out.println("Hatali Bilgi");
         }
    }
}
