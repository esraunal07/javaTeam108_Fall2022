package Day29_final_abstractClasses;

public class EChild extends DParent{
    @Override
    public void method1() {
        System.out.println("Parent classdaki mecburi override edilecek method1 i override ettik");

    }

    @Override
    public void method2() {
        System.out.println("Parent classdaki mecburi override edilecek method2 i override ettik");

    }

    /*
    Klasik inheritance ile parent child iliskisi olusturdugumuzda
    Parent classdaki tum özellikleri otomatik olarak kazaniriz.
    Ancak methodlari Override etme mecburuiyeti yoktur.
    Ister Override edip kendimize ozellestiririz.
    Istersek de parent classdaki haliyle kullaniriz.
     */

    public static void main(String[] args) {

        //DParent obj1=newDparent();
        //Dparent is abstract; cannot be instatiated
        //Abstract classlarin constructorlari vardir ama obje uretemez.



        EChild chld1=new EChild();
        chld1.method1();
        chld1.method2();
        chld1.method3();

        DParent chld2=new EChild();
        chld2.method1();
        chld2.method2();
        chld2.method3();
    }

}
