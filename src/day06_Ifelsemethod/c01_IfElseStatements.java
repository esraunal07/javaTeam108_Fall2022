package day06_Ifelsemethod;

import java.util.Scanner;

public class c01_IfElseStatements {
    public static void main(String[] args) {

        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // Ucgen eskenar ise "eskenar ucgen" yzdirin, degilse "eskenar degil" yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("ucgenin kenar uzunluklarini giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>1) {
            System.out.println("eskenar ucgen");
        } else {
            System.out.println("eskenar degil");
        }
    }
}
