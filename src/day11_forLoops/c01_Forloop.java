package day11_forLoops;

import java.util.Scanner;

public class c01_Forloop {
    public static void main(String[] args) {

        //kullanicidan bir char alip o karakterden sonra gelen
        // 10 karakter yazdirin.

        Scanner scan=new Scanner(System.in) ;
        System.out.println("Lutfen bir karakter giriniz");
        char girilenkarakter=scan.next().charAt(0) ;

        for (int i = 1; i <=10; i++) {
            System.out.print((char)(girilenkarakter+i)+ " ");

        }
    }
}
