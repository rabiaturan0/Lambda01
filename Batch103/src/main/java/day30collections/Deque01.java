package day30collections;


    import java.util.Deque;
    import java.util.LinkedList;

    /*
            Deque: Double Ended Queue manasindadir yani iki uclu Queue demektir.
            FIFO(First In First Out) ve LIFO(Last In First Out) beraber gerektiginde kullanilir.
         */
    public class Deque01 {

        public static void main(String[] args) {

            Deque<String> furnitureTruck = new LinkedList<>();
            furnitureTruck.add("Chair");
            furnitureTruck.add("Mirror");
            furnitureTruck.add("Sofa");
            furnitureTruck.add("Bed");
            furnitureTruck.add("Bed");
            furnitureTruck.add("Bed");
            furnitureTruck.add("Dining Table");
            System.out.println(furnitureTruck);// [Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]


            furnitureTruck.push("Refrigerator");
            System.out.println(furnitureTruck);//[Refrigerator, Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]



        }

}
