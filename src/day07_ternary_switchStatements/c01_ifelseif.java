package day07_ternary_switchStatements;

import java.awt.*;
import java.util.Scanner;

public class c01_ifelseif {

    public static void main(String[] args) {
        //kullanicidan bir tam sayi alin.
        //rakam ise "girilen sayi rakam"
        //sayi 2 basamakli ise "girilen sayi 2 basamakli"
        //sayi 2 basamaktan  buyukse "buyuk sayi" yazdir.

        Scanner scan =new Scanner(System.in) ;
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilensayi= scan.nextInt();

        if (0<=girilensayi && girilensayi<=9) System.out.println("girilen sayi rakam");
        else if (10<=girilensayi && girilensayi<=99 ) System.out.println("girilen sayi iki basamakli");
        else if (girilensayi>=100) System.out.println("buyuk sayi");


        }
    }
