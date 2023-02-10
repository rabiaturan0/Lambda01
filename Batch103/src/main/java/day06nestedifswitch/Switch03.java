package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        //kullanicidan islem ve  iki tane sayi alarak islemin sonucunu ekrana yazdiran basit bir hesap makinesi yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println(" islemi giriniz:+,-,*,/,%");
        char islem = input.next().charAt(0);

        System.out.println("ilk sayiyi gir...");
        double ilk = input.nextDouble();

        System.out.println("ikinci sayiyi giriniz");
        double ikinci = input.nextDouble();

        switch (islem){

            case '+':
                System.out.println(ilk + ikinci);
                break;
            case '-':
                System.out.println(ilk + ikinci);
                break;
            case '*':
                System.out.println(ilk + ikinci);
                break;
            case '/':
                System.out.println(ilk + ikinci);
                break;
            case '%':
                System.out.println(ilk + ikinci);
                break;
            default:
                System.out.println("bu islem tanimlanmamistir...");
        }
    }
}
