package day14arraysforeachloop;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        //Arays'lerin icine sadece  "primitive data type" leri yerlestirilebilir.

        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprise you";

        System.out.println(Arrays.toString(str));

        //String bir erey olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz
        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "rojda"};

        for (String w : arr){
            System.out.println(w+" ");
            if (w.equals("Tom")){
                break;
            }
            }


        System.out.println();
        //String bir erey olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz
        String ddd[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "rojda"};

        for (String w : ddd){
            if (w.equals("Tom") || w.equals("Jane")){
                continue;
            }
            System.out.println(w+" ");
        }

        //Example 3: bir ogretmenin sinifindaki islemlerini application'a yuklemesini saglayan kodu yaziniz
        //           (kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz)

        Scanner input = new Scanner(System.in);

        System.out.println("kac ogrenci ismi gireceksiniz?");
        int numOfStd = input.nextInt();

        String names[] = new String[numOfStd];
        System.out.println("Girisi sonlandirmak icin Q harfine basiniz ");

        for (int i=1; i<=numOfStd; i++){

            System.out.println("Lutfen " + i + ". ogrencinin ilk ismini giriniz");


            String stdname = input.next();

           if (stdname.equalsIgnoreCase("Q")){
                break;
            }

           names[i-1] = stdname;

        }
        System.out.println(Arrays.toString(names));


    }
}
