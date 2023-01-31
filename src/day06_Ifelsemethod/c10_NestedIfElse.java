package day06_Ifelsemethod;

import java.util.Scanner;

public class c10_NestedIfElse {
    public static void main(String[] args) {
        ////Soru 3- Kullanicidan aldigi urun adedi ve
        //    // ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
        //    // Musteri karti varsa 10 urunden fazla alirsa %20,
        //    // yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz");
        int urunadedi = scan.nextInt();

        System.out.println("urunun liste fiyatini giriniz");
        double ListeFiyati = scan.nextDouble();

        System.out.println("Musteri Kartiniz var mi \nE:Evet H:Hayir ");
        char kartVarMi = scan.next().charAt(0);
        // kart ana degisken olsun

        if (kartVarMi == 'E' || kartVarMi == 'e') { //kart var
            if (urunadedi <= 0) System.out.println("gecersiz urun miktari");
            else if (urunadedi > 10) System.out.println("%20 indirimli toplam fiyat:" + urunadedi * ListeFiyati * 0.8);
            else System.out.println("%15 indirimli toplam fiyat:" + urunadedi * ListeFiyati * 0.8);

        } else if (kartVarMi == 'H' || kartVarMi == 'h') { //kart yok

        } else System.out.println("Kart bilgisi gecersi"); //hatali kart bilgisi
        if (urunadedi <= 0) System.out.println("gecersiz urun adedi");
        else if (urunadedi > 10) System.out.println("%15 indirimli toplam fiyat: " + urunadedi * ListeFiyati * 0.85);
        else System.out.println("%10 indirimli toplam fiyat: " + urunadedi * ListeFiyati * 0.9);

    }

    }



