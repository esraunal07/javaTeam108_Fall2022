package day10_StrinManipulations;

public class c08_forloop {
    public static void main(String[] args) {

        // 1 ile 1000 arasindaki sayilari(sinirlar dahil) yanyana yazdirin
        // yazdirma islemi bittiginde
        // "tum bu sayilarin toplami= "deyip sayilarin toplamini yazdirin.
        int sayilarinToplami = 0;
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i + " ");
            sayilarinToplami +=i ;
        }
        System.out.println("");
        System.out.println("tum bu sayilarin toplami= " + sayilarinToplami);

    }
}
