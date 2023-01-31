package day11_forLoops;

public class c09_NestedLoop {
    public static void main(String[] args) {

        // input olarak verilen kenar uzunluklarina göre asagidaki sekli cizdirin

        int kisakenar=6;
        int uzunkenar=9;

        /*
        * * * * * * * *
        * * * * * * * *
        * * * * * * * *
        * * * * * * * *
        * * * * * * * *
         */
        for (int i = 1; i <=kisakenar; i++) {
            System.out.print("* ");
            for (int j = 1; j <=uzunkenar ; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }




    }
}
