package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {
        //Example 1: "Anlik tarihi" (Current Date) ekrana yazdiran kodu yaziniz
        LocalDate currentDate = LocalDate.now();

        System.out.println(currentDate);
        //Example 2: "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //Example 3: "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time)
        // ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);// 2022-10-21T13:46:19.435213

        //Example 4: Japonya'daki "Anlik tarihi"(Current Date) ve "Anlik zamani"
        // (Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);// 2022-10-22T02:51:53.899959

        //Example 5: Istanbul'daki "Anlik tarihi"(Current Date) ve "Anlik zamani"
        // (Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);// 2022-10-21T20:53:17.682534

        //Example 6: Bugunden 789 gun sonra emekli olacaginiza gore, emeklilik tarihini
        // hesaplayan kodu yaziniz.

        LocalDate countDate = LocalDate.of(2022,10,21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);

        //Example 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz
        LocalDate dobAli = LocalDate.of(2005, 5, 17);
        LocalDate dobVeli = LocalDate.of(2013, 2, 8);

        //between(dobAli, dobVeli) method'u kullanildiginda daha eski olan tarih once yazilmalidir
        Long diff = ChronoUnit.DAYS.between(dobAli, dobVeli);
        System.out.println(diff);//2824


        // Example 8: İstanbulun fethi ile Cumhuriyetin kurulması arasında kaç ay olduğunu gösteren kodu yazınız
        //            29  Mayis 1453 ==> Istanbulun fethi         29 Ekim 1923 ==> cumhuriyetin kurulusu

        LocalDate istanbulunFethi = LocalDate.of(1453,5,29);
        LocalDate cumhuriyetKurulusu = LocalDate.of(1923,10,29);

        long aySayisi = ChronoUnit.MONTHS.between(istanbulunFethi,cumhuriyetKurulusu);
        System.out.println(aySayisi);

        //Example 9: Verilen tarihin hangi burcta oldugunu veren kodu yaziniz.

        LocalDate myDate = LocalDate.of(1989,3,22);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        //1 yol :
         if (day>=21 && month==3){
             System.out.println("koc");
         } else if (day<=20 && month==4) {
             System.out.println("koc");
         }else if (day>=21 && month==4){
             System.out.println("boga");
         }else if (day<=20 && month==5){
             System.out.println("boga");
         }

         //2yol :
        if ((day>=21 && month==3) || (day<=20 && month==4) ){
            System.out.println("koc");
        } else if ((day>=21 && month==4) || (day<=20 && month==5)) {
            System.out.println("boga");
        }

    }
}