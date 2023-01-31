package day11_forLoops;

public class c08_NestedForLoop {
    public static void main(String[] args) {

        // verilen inputa göre carpim tablosu olusturun
        // javada ic ice yapilara nested denir.
        //burada farkli olan i'nin katsayisi oldugundan

        int input = 4;
        /*
        1 2 3 4
        2 4 6 8
        3 6 9 12
        4 8 12 16
         */

        // 1 2 3 4

        for (int i = 1; i <= 4; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = 1; i <=4 ; i++) {
            System.out.print(2*i + " ");
        }
        System.out.println("");
        for (int i = 1; i <=4; i++) {
            System.out.print(3*i + " ");
        }
        System.out.println("");
        for (int i = 1; i <=4; i++) {
            System.out.print(4*i + " ");

        }
        System.out.println("");
        // nestedforloop ile cözelim

        for (int i = 1; i <=4; i++) { //outer loop denir ve i'nin carpilacagi sayiyi kontrol edecek
            for (int j =1; j <=4; j++) { // inner loop denir ve onceki ornekteki 1. degiskeni kontrol eder
                System.out.print(i*j + " ");
            }
            System.out.println(""); // alt satira gecmek icin bunu yaptik
        }
        // outer loopun her bir deger artisi icin
        // inner loop bastan sona calisir
    }


    }

