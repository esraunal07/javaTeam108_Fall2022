package day07_ternary_switchStatements;

public class c03_ternary {
    public static void main(String[] args) {

        // input olarak verilen sayiyi kontrol edip
        //sayi cift ise "cift sayi"
        // degilse "tek sayi" yazdirin

        int input=15 ;

                //if else ile yapalim

        if (input%2==0) {
            System.out.println("cift sayi");
        } else {
            System.out.println("tek sayi");
        }

        // ternary ile yapalim

        System.out.println(input%2==0 ? "cift sayi": "tek sayi");


    }
}
