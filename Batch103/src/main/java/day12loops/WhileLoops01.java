package day12loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {

        //Example 1: 3 den 10 akadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz

        //1.yol:
        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //2.yol:
        int i = 3;

        while (i < 11) {

            System.out.print(i + " ");

            i++;
        }
        //Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satir da yazdiran kodu yaziniz

       int k=17;

        while (k>3){
            if (k%2==0){
                System.out.print(k + " ");
            }
            k--;
        }
        System.out.println();
        //Example 3: 12 den 67 ye kadar sayıların toplamını veren kodu yazınız
        int sum = 0;
        int m = 12;

        while (m < 68) {

            sum = sum + m;

            m++;

        }
        System.out.println(sum);

        //Example 4: Size verilen bir tamsayinin rakamlari toplamini ekrana yazdiran kodu yaziniz


        int sonuc = 0;
        int sayi = 385;
        while (sayi > 0) {
            sonuc = sonuc + sayi % 10;

            sayi = sayi / 10;
        }
        System.out.println(sonuc);

        //Example 5:kullanicidan aliginiz bir sayinin carpim tablosunu ekrana yazdiriniz
        //          3==> 3*1=3  3*2=6  3*3=9  ...3*10=30

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablsounu gormek icin bir sayi giriniz");
        int s = input.nextInt();
        int l=1;
         while (l<11) {

             System.out.println(s + "x" + l + "=" + s * l);
             l++;
         }

         }
}
