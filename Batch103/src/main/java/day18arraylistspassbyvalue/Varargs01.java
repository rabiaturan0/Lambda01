package day18arraylistspassbyvalue;

public class Varargs01 {

    /*
    1)Farklı sayılardaki parametrelerle çalışabilen bir method oluşturmak
    isterseniz "varargs" kullanmalısınız.
    2)"varargs" arka tarafta "Array" kullanır, bu yüzden "varargs" larla
    çalışırken "Array"lerle çalışıyormuş gibi davranabilirsiniz.
    3)
     */
    public static void main(String[] args) {
        int r1 = add(2,3);
        System.out.println(r1);

        int r2 = add(2,3,4);
        System.out.println(r2);

        int r3 = add(2,3,4,5,6,7,8);
        System.out.println(r3);


    }
//    //Iki sayinin toplamini return eden method u olusturunuz
//    public static int add(int a, int b) {
//        return a + b;
//
//    }
//    //uc sayinin toplamini return eden method u olusturunuz
//    public static int add(int a, int b, int c) {
//        return a + b + c;
//    }
    //Istedigimiz kadar sayiyi toplayabilecegimiz bir method olusturalim.

    public  static int add(int...a){
        int sum = 0;

        for (int w : a){
            sum=sum+w;
        }
        return sum;
    }
}