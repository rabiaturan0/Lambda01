package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        /*
        Kullaniciya ay ismi sor ve kullanicinin verdigi ay isminde son aya kadar ekrana yazdir.
         */

        //Note: tolawerCase() methodu bir String deki tum karakterleri kucuk harfe cevirir
        //Note: toUpperCase() methodu bir String deki tum karakterleri buyuk harfe cevirir
        Scanner input = new Scanner(System.in);
        System.out.println("ay ismini giriniz");
        String ayIsmi = input.next().toLowerCase();

        switch (ayIsmi){
            case "ocak":
                System.out.println("Ocak");
            case "subat":
                System.out.println("Subat");
            case "mart":
                System.out.println("Mart");
            case "nisan":
                System.out.println("Nisan");
            case "mayis":
                System.out.println("Mayis");
            case "haziran":
                System.out.println("Haziran");
            case "temmuz":
                System.out.println("Temmuz");
            case "agustos":
                System.out.println("Agustos");
            case "eylul":
                System.out.println("Eylul");
            case "ekim":
                System.out.println("Ekim");
            case "kasim":
                System.out.println("Kasim");
            case "aralik":
                System.out.println("Aralik");
                break;
            default:
                System.out.println("gecerli ay ismi gir");
        }
    }
}
