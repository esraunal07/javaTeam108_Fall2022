package Day20_Constructor;

public class Car {
    /*
     Bir class'dan olusturulabilecek objelerin ozelliklerini
     variable veya method'larla belirleyebiliriz
  */
    String marka = "Marka Belirtilmemis";
    String model = "Model belirtilmemis";
    int yil=1900;
    int km;
    String renk="Renk secilmedi";
    public Car(String marka, String model, int yil) {
      this.marka=marka;
      this.model=model;
      this.yil=yil;
    }
    public static void hareket(){
        System.out.println("Tum arabalar hareket eder");
    }
    public Car(){
    }
    public Car(String mrk, String mdl, int yl, int kmetre, String rnk){
        marka=mrk;
        model=mdl;
        yil=yl;
        km=kmetre;
        renk=rnk;
    }
    /*
        Bir class'da gorunur bir constructor olusturdugumuzda
        Java default constructor'i siler
        Bu durumda daha onceden default constructor'i kullanarak obje olusturan class'larda CTE olusur
        Bu tur sorunlara sebep OLMAMAK icin
        biz herhangi bir constructor olusturdugumuzda
        bir tane de parametresiz constructor OLUSTURURUZ

        Constructor'da parametre olarak kullanicidan gelen degeri
        class level daki instance variable'a atamaliyiz.
        eger parametre ismi ile instance variable ismi farkli ise sorun yok
        java otomatik olarak atamamizi saglayacktir.

        public Car(String mrk, String mdl, Int yl, int kmetre,String rnk) gibi
        marka=mrk;
        model=mdl;
        yil=yl;
        km=kmetre;
        renk=rnk;

        eger parametre isismlerini anlasilir olmasi icin instance variable ile ayni yaparsak

     */
    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                "\n, model='" + model + '\'' +
                "\n, yil=" + yil +
                "\n, km=" + km +
                "\n, renk='" + renk + '\'' +
                '}';
    }

}
