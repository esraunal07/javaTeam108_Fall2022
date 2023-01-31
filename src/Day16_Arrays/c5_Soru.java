package Day16_Arrays;

public class c5_Soru {
    public static void main(String[] args) {

        // Verilen bir arraydeki pozitif tam sayilari toplayip
        //sonucu bize donduren bir method yaziniz.

        int [] sayilar = {3,7,1,9,-3,-11,-50};
        System.out.println(arraydekiPozitifSayilariTopla(sayilar));

    }

    public static int arraydekiPozitifSayilariTopla(int[] arr) {
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {

                toplam += arr[i];
            }

        }
        return toplam;
    }
}
