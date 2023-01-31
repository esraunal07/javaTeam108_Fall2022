package day06_Ifelsemethod;

import java.util.Scanner;

public class c02_IfElseStatements {
    public static void main(String[] args) {
        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //  Ucgen ikizkenar ise "ikizkenar ucgen" yzdirin, degilse "ikizkenar degil" yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini yazin");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

             if ((kenar1==kenar2 && kenar1!=kenar3 ) ||
                (kenar2==kenar3 && kenar2!=kenar1) ||
                (kenar3==kenar1 && kenar3!=kenar2)) {
                 System.out.println("ikizkenar ucgen");
             }else {
                 System.out.println("ikizkenar degil");
             }


    }

}
