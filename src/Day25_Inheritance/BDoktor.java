package Day25_Inheritance;

public class BDoktor extends Apersonel {

    /*
    olusturdugumuz Doktor classinda isim soyisim gibi
     personel classinda olsústurulan tum özelliklerinin olmasini istiyoruz.
     bu durumda 2 tercih var.
    1- istenen tum özelikkeri Doktor classinda yeniden olsuturabiliriz
    2- Doktor classini Personel'in childi yapmak

    Doktor class'ini Personel classinin childi yaptigimizda
    Doktor classindan olusturulan objeler sadece kendi classlarindaki ozellilere
    sahip olmazlar ayni zamanda parent classi olan personeldeki ozellilklerede
    sahip olurlar.
    Bir child classdan obje olusturdugumuzda o objenin özelliklerini belirlerken
    once kendi classina bakilir ve o özellik varsa kullanilir.
    eger kendi classinda yoksa parent classa bakilir.

    Bir class extend keyword kullanarak  baska bir classi kendine parent edinirse
    1- parent classdaki tum özellikleri direk kullanabilir.
    (isim-soyisim-telefon-ozelsigorta)
    2- isterse parent classda olan bir özelligi kendisine uyarlayabilir.
    (maas gibi)
    3- parent classda olmayan kenisine ozel yeni ozellikleri olusturabilir.
    (Nobet)

     */
    public static void main(String[] args) {

        BDoktor dok1=new BDoktor();
        dok1.isim="Kemal";
        dok1.soyisim="Bulut";

        System.out.println(dok1.isim+" "+dok1.soyisim+" "+dok1.telefon);
        // Kemal Bulut telefon atanmadi.
        dok1.maas();
        dok1.ozelsigorta(); //Tum personelin ozelsigorta hakki vardir
        dok1.nobet(); //doktorlar haftada 1 gun nöbet tutar
        }


public void maas(){
    System.out.println("Doktor maasi 30*8*25: " + 6000);
}
public void nobet(){
    System.out.println("doktorlar haftada 1 gun nöbet tutar");
}
}

