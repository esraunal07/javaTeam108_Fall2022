package day28_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_MultipleCheckedExceptions {

    public static void main(String[] args) {

        //Metin txt. dosyasindaki yazilari yazdiralim
        /*
        Eger birden fazla catch cumlemiz varsa ve exceptionlar arasinda
        child-parent iliskisi varsa once childexc. sonra parent exception yazilmalidir.
        Ikisini yazmak istemezsek sadece parent exception yeterli olacaktir.
        Cunku parent daha daha kapsayicidir.

         */

        try {
            FileInputStream fis= new FileInputStream("src/day28_Exceptions/metin.txt");
            int k=0;
            while ((k= fis.read()) !=(-1)) {
                System.out.println((char) k);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
