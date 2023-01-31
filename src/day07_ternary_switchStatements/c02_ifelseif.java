package day07_ternary_switchStatements;

import java.util.Scanner;

public class c02_ifelseif {


    public static void main(String[] args) {
        //kullanicidan bir tam sayi alin.
        //sayi negatif ise "girilen sayi negatıf"
        //sayi 2 basamakli ise "girilen sayi 2 basamakli"
        //sayi 2 basamaktan  buyukse "buyuk sayi" yazdir.


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilensayi= scan.nextInt();

        if (girilensayi<0 ) System.out.println("negatif sayi");
        else if (girilensayi<=9) System.out.println("girilen sayi rakam");
        else if (girilensayi<=99) System.out.println("girilen sayi iki basamakli");
        else System.out.println("buyuk sayi");



        {

        }


    }



}
