package day07_ternary_switchStatements;

public class c06_sorular {
    public static void main(String[] args) {

        //Kullanicidan notunu alin 50 ve daha buyukse "sinifi gectin,
        // 50'den kucukse "malesef kaldin" yazdiri.

        int input= 44;

        System.out.println(input>=50 ? "sinifi gectin" : "malesef kaldin");

        // kullanicidan bir harf isteyin
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin
        //yoksa girilen harfi yazdirin

        char karakter = 'a' ;

        System.out.println(karakter<='a' && karakter<='z' ? (char) (karakter-32): karakter) ;

        // Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        input=-45;

        System.out.println(input>0 ? input : (-1)*input);




















    }
}
