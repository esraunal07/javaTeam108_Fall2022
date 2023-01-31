package day11_forLoops;

public class c11_NestedLoop {
    public static void main(String[] args) {
        /*
      input degerine kadar her satirda * sayisini bir arttirip
      sonra azaltarak asagidaki sekli yazdirin-
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        ipucu: artis ve azalis kisimlarini 2 ayri nestedloop ile yapmaliyiz
         */
        int input=5;
        //artis kismi icin nested loop
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        } //azalis kismi icin nested loop
        for (int i = input-1; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
