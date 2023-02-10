package day18arraylistspassbyvalue;

public class PassByValue01 {

    /*
    1) Java variable lerin orijinal degerlerini korumak ister
    2)Variable methodlar icinde kullanildiginda java method un
    icine irijinal degeri koymaz , o degerin kopyasini uretirve method a kopyayi yollar.
    Metot kopya üstünde değişiklik yapar, dolayısıyla variable'ın
    orijinal değer korunmuş olur. Bu sisteme "Pass By Valoue" denir.
    Note: Java "Pass By Valoue" kullanir .
    Note: Bazi programlama dilleri orjinal degeri koruma altina almamistir.Bu isi Developer'lara
    birakmistir. Bu tarz diller Pass by Referance kullanir
     */

    public static void main(String[] args) {
        int x = 5;//gomlek
        System.out.println(x);

        //static method olan main methodun icindeki hersey static olmalidir.
        change(5);//ogrencigomlegi
        System.out.println(x);

        int ucret = 100;
        int kopya = indirim(ucret);
        System.out.println(kopya);
        System.out.println(ucret);
    }
        public static void change(int a){
            System.out.println(a*3);

        }
        //void disindaki return type larda method bady si icinde return keyword kullanilmalidir.
        public  static  int indirim(int gomlekUcreti){
            return gomlekUcreti -10;
        }

}
