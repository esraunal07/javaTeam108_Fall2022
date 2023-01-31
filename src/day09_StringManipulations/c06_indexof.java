package day09_StringManipulations;

import java.util.Scanner;

public class c06_indexof {
    public static void main(String[] args) {

        //kullanicidan aldigimiz cumle "cok" ile baslayan iki kelime yazdirin
        // cumlede 'cok' kelimesi gecmiyorsa "cumlede cok ile baslayan kelime yok" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String girilencumle = scan.nextLine();

        //sinavlarimizda coktan secmeli sorular kullaniyoruz
        //javayi cok seviyoruz
        //bu kadar coklu secenek olur mu?

        if (!girilencumle.contains("cok")) {
        System.out.println("cumlede cok ile baslayan kelime yok");
       }else {

            int cokindexi = girilencumle.indexOf("cok");
            int boslukindexi = girilencumle.indexOf(" ", cokindexi + 1);

            System.out.println(girilencumle.substring(cokindexi, boslukindexi));

        }
        }
}
