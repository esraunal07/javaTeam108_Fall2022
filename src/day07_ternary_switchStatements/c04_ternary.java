package day07_ternary_switchStatements;

public class c04_ternary {
    public static void main(String[] args) {

        // kullanicidan alinan deger
        // 100 den buyukse sayiyi 2 ile carpin
        // 100 den kucukse sayiya 10 ekleyin

        int input = 130;

        if (input>100) {
            input*=2;
        }else input+=10 ;

        System.out.println("if else ile :" +input);

        input=130;
        input=input>100 ? input*2 : input+10 ;

        System.out.println("ternary ile : "+ input);






    }
}
