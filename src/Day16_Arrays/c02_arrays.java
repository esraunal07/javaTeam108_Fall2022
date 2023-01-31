package Day16_Arrays;

import java.util.Arrays;

public class c02_arrays {
    public static void main(String[] args) {

        // verilen bir String arrayin tum elementlerini yazdirin

        String[] isimler = {"Huseyin", "Yusuf", "Mehmet", "Akile", "Said"};

        System.out.println(Arrays.toString(isimler)); //[Huseyin, Yusuf, MEhmet, Akile, Said]

        for (int i = 0; i < isimler.length ; i++) {
            System.out.print(isimler[i] + " "); // Huseyin Yusuf Mehmet Akile Said
        }





    }
}
