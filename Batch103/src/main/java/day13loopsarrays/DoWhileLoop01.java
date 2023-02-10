package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //Example 1: kullanıcıdan bir sayi aliniz sayi 100 den kucuk ise ekrana kazandin yazdiriniz
        //aksi halde ekrana kaybettin yazdiriniz
        //kullanici kazandikca oyun devam etmeli


        Scanner input = new Scanner(System.in);
        int sayi = 0;
        do {
            System.out.println("bir sayi giriniz ");
            sayi = input.nextInt();

            if (sayi<100){
                System.out.println("kazandiniz");
            }

        }while (sayi<100);
        System.out.println("kaybettiniz");

        //Example 2: kullanicidan ismini aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz

        do {
            System.out.println("bir isim giriniz");
            char ilkharf = input.next().charAt(0);

            if (ilkharf>='A' && ilkharf<='Z'){
                System.out.println("ismi basariyla girdiniz ");

            }else {
                System.out.println("ismi yanlis girdiginiz icin islem iptal edilmistir");
                break;
            }
        }while (true);

//        //Infinite Loop: Sonsuz dongu
//
//        //Artirma azaltma kisminda hata yaparsaniz "infinite loop sorunsal" i olusur.
//        for(int i=1; i<4; i++){
//            System.out.println("Hi!");
//        }
//        //Artirma azaltma kismini yazmazsaniz "infinite loop sorunsal" i olusur.
//        for(int i=1; i<4; ){
//            System.out.println("Hi!");
//        }
//
//        //Artirma azaltma kismini yazmazsaniz "infinite loop sorunsal" i olusur.
//        int i = 12;
//        while(i<15){
//            System.out.println("Hi!");
//        }

    }
}
