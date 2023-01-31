package Day27_overriding;

public class CAvciKuslar extends BKuslar{


    protected void hareket( ) {
        System.out.println("ucarlar");
    }
    protected void beslenme( ) {
        System.out.println("et yerler");
    }
    protected void pence( ) {
        System.out.println("pencelidir");
    }
    protected void gaga( ) {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        CAvciKuslar krt1=new CAvciKuslar();
        krt1.hareket();// c
        krt1.beslenme(); //c
        krt1.pence();//c
        krt1.gaga(); //c
        krt1.kanat();//b
        krt1.solunum();//b
        krt1.cogalma();//b
        krt1.omur();//a

        //Eger constructor ile data turu ayni ise ozelligin
        // variable ve method olmasina bakilmaksizin
        // o classa gidilir, o class veya parent classlarda bulunan ilk deger kullanilir.

        BKuslar krt2=new CAvciKuslar();
        krt2.hareket();// c ucarlar
        krt2.beslenme(); //a et yerler
      //  krt2.pence();//Bkuslar veya parent classda yok cte verir.
        krt2.gaga(); //c sivri gagali
        krt2.kanat();//b kanatlidirlar
        krt2.solunum();//b akcigerle nefes alirlar
        krt2.cogalma();//b yumurtayla cogalirlar
        krt2.omur();//a yasar ve olurler


        AHayvanlar krt3=new CAvciKuslar();
        krt3.hareket();// c ucarlar
        krt3.beslenme(); //a et yerler
         //  krt3.pence();//Ahayvanlarda  yok cte verir.
         //krt3.gaga(); // Ahayvanlarda yok cte verır
        //  krt3.kanat();// Ahayvanlarda yok cte verır
        krt3.solunum();//b akcigerle nefes alirlar
        krt3.cogalma();//b yumurtayla cogalirlar
        krt3.omur();//a yasar ve olurler


    }
}
