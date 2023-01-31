package day11_forLoops;

public class c04_ForLoop {

    public static void main(String[] args) {

        // eger sart i'nin her degeri icin true olmuyorsa
        // loop calisir ama loop bodysi devreye hic girmediginden islem yapilmaz

        //input olarak verilen sayidan bire kadar tum sayilari yazdirin.

        int input=23; //eger kullanicinin + veya - girebilecegini ongörup ona göre kod yazmazsak
                        // loop bodysinin hic calismamasi durumu olabilir.
        if(input>1) {
            for (int i = input; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }else {
            for (int i = input; i <=1 ; i++) {
                System.out.print(i+ " ");

            }

            // eger sart i'nin tum degerleri icin dogru oluyorsa

            // input olarak verilen sayidan 100'e kadar tum sayilari yazdirin


            }
        input =10;

        for (int i = input; i <=100; i++) { // i-- yazsak sonsuzluk olusur.
            System.out.print(i+ " ");
        }
    }
}
