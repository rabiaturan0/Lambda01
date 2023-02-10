package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {
    public static void main(String[] args) {

        //Multidimensional Array kisa yoldan nasil olusturulur
        char arr [][] = { {'a', 'b'}, {'C','D','E'},{'?'} };

        System.out.println(Arrays.deepToString(arr));

        // Bir String Multidimensional Array icinde "a" olan elemanlari konsola yazdirinz.
        String brr[][] =  { {"learn", "java", "it"}, {"is", "easy"} };

        for (String[] w : brr){

            for (String k : w){

                if (k.contains("a")){
                    System.out.print(k+" ");

                }

            }
        }


     }
  }

