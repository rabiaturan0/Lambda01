package day16multidimensionalarraysarraylists;

public class MultiDimensionalArray02 {
    public static void main(String[] args) {
        //MultiDimensional Array deki en buyuk ve en  kucuk elemanin toplamini veren kodu yaziniz.
         int arr[][] = { {2, 5, 1}, {83,75} };

         int maxEleman = arr[0][0];
         int minEleman = arr[0][0];
         for (int[] w: arr){

             for (int k:w){
                 maxEleman = Math.max(maxEleman, k );
                 minEleman = Math.min(minEleman, k);
             }
         }
        System.out.println(maxEleman);
        System.out.println(minEleman);

        System.out.println(maxEleman+minEleman);


    }
}
