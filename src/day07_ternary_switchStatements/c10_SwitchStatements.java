package day07_ternary_switchStatements;

public class c10_SwitchStatements {
    public static void main(String[] args) {
// Kullanicidan gun numarasini alip
        // gun ismini yazdirin

        int gunNo=7;

        switch (gunNo){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Haftaıcı");
                break;
            case 6 :
            case 7 :
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("Gecersiz gun numarasi");
        }
    }

    }

