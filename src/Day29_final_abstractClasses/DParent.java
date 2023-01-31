package Day29_final_abstractClasses;

public abstract class DParent {

    /*
    Child classlarin tamaminda method1 ve method2 nin mutlaka olmasini istiyoruz.

    Java parent classdaki istenen methodlari child classlarin override etmek zorunda kalmasi icin
    abstract classini olusturmustur.

    bir classi abstract yapmak istersek class deklarasyonuna abstract yazmamiz yeterli

    bir abstract classin icinde child classlarin override etmesi mecburi olan methodlar
    olabilecegi gibi mecburi olmayan methodlar da olabilir.

    Child classlarin mutlaka override edecegi methodlari da abstract yapariz.

    abstract yapilan tum methodlar child classlarin tamamina override edileceginden
    parent classdaki abstract methodun bodye iktiyaci olmaz.
    Java da abstract methodlarin bodysi olmasina izin vermez.

    Abstract classlarda abstract methodlar bulundugu icin
    Abstracr classlardan obje uretilemez.
     */


    public abstract void method1();

    public abstract void method2();

    public void method3() {

        System.out.println("Parent classdaki method3 calisti");
    }

}
