package day07_ternary_switchStatements;

public class c08_SwitchStatements {

    public static void main(String[] args) {

        // kullanicidan 2 sayi alin
        // ve kullaniciya istedigi islemi sorun
        // +,-,*,/,isaretlerinden hangisini girerse
        // 2 sayi icin o islemi yapin
        // bu isaretlerdn birini girmezse
        // yanlis islem tercihi yazdirin

        int sayi1=20 ;
        int sayi2=10 ;
        char islem='-' ;
        // if else ile yapalim

        if (islem=='+') {
            System.out.println("Sayilarin Toplami :" + (sayi1+sayi2));
        } else if (islem=='-') {
            System.out.println("Sayilarin farki :" + (sayi1-sayi2));
        } else if (islem=='*') {
            System.out.println("SAyilarin carpimi :" + (sayi1*sayi2));
        } else if (islem=='/') {
            System.out.println("Sayilarin bölumu :" + (sayi1/sayi2));

        }else {
            System.out.println("yanlis islem tercihi");
        }

        // Switch statement ile yapalim

        switch (islem){

            case '+' : System.out.println("Sayilarin Toplami :" + (sayi1+sayi2));
            case '-' : System.out.println("Sayilarin farki :" + (sayi1-sayi2));
            case '*' : System.out.println("SAyilarin carpimi :" + (sayi1*sayi2));
            case '/' :  System.out.println("Sayilarin bölumu :" + (sayi1/sayi2));
            default:  System.out.println("yanlis islem tercihi");
        }





    }
}
