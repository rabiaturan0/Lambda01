package day07ternarystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {
        //Example 1. Bir sayinin pozitif mi negatif mi oldugunu ekrana yazdiran kodu yaziniz.

        //1.Way: if-else
        int a = 12;
        if(a>0){
            System.out.println("pozitif");
        }else {
            System.out.println("pozitif degil");
        }

        //2.yol:ternary
                     //CONDITION   ?   Condition dogru ise uygulanacak kod    :   Condition yanlis ise uygulanacak kod
        String sonuc =    a>0      ?            "pozitif"                     :             "pozitif degil";
        System.out.println(sonuc);


        //Example 2: Iki sayidan kucuk olani secen kodu yaziniz
        int b = 23;
        int c = 13;

        int min = b<c ? b : c;

        System.out.println(min);

        //Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //           Pozitif sayilarin ve sifirin mutlak degeri kendileridir.
        //           Negatif sayilarin mutlak degeri -1 ile carpilmis halleridir
        int d = 45;
        int abs = d<0 ? -1*d : d;

        System.out.println(abs);
        //Example 4: Iki tane soyi ayni isaretli ise bu sayilari carpiniz, farkli isaretli ise "islem yapamam" mesaji veriniz
        int e = 12;
        int f = 10;
        //Ternary farkli data type lerinde sonuc return ederse data type ni "object" yapiniz.
        Object islem= e>0 && f>0 || (e<0 && f<0) ? e*f : "islem yapamam";
        System.out.println(islem);

        //Note : Javada her class'in en az bir tane "parent" class'i vardir.
        //       sadece "Object" class'in parent class i yoktur


    }
    }
