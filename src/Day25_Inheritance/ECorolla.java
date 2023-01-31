package Day25_Inheritance;

public class ECorolla extends DToyota{

    ECorolla(){
        System.out.println("Parametresiz toyota constructor calisti");
    }

    String model="Corolla";
    String uretimyeri="Turkiye";

    public static void main(String[] args) {

        ECorolla cor1=new ECorolla();

    }

    /*
    Bir obje olusturuldugunda ilk deger atamasi yaoilabilmesi icin
    Constructor calismalidir.
    Inheritance de biliyoruz ki childclassdan olusturulan her obje
    parent classdaki ozellilere de sahip olur.
    parent classdaki ozellilere sahip olabilmesi icin
    parent classdaki constructorlarda calismalidir.

    Java bu calismayi super() call sayesinde saglar-
    Javada her olusturulan classda gorunmese de default
    constructor oldugu gibi extend keyword kullanilan
    her classda olusturulan her const. ilk satirinda
    gorulmesede super() call vardir.
     */

}
