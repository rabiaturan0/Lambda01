package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String a = "Java Kolaydir ";

        //startsWith("kola", 5) kodu ilk 5 karakter'den sonraki String'e bakar ve o String'in "kola" ile baslayip baslamadigini kontrol eder.
        //"kola" ile basliyorsa "true", baslamiyorsa "false" return eder.

        boolean b = a.startsWith("kola",5);
        System.out.println(b);

        //replaceFirst("a", "*"); kod String deki ilk "a" yi "*" e cevirir.
        //replace("a", "*"); kod String deki tum "a" lari "*" e cevirir.
        String c = a.replaceFirst("a","*");
        System.out.println(c);//J*va kolaydir

        //concat() method'u iki tane String'i birbirine yapistirmaya yarar.
        //"Concatenation" islemi iki turlu yapilabilir;i)+ ile  ii)connat() ile
        //Java bir islem icin method uretmisse o method'u kullanmak "best practice" dir.
        String d = a.concat("Anladin mi?");
        System.out.println(d);//Java Kolaydir. Anladin mi?

        String e = "     Tom Hanks   ";
        System.out.println(e);

        //trim() methodu bir string deki bas ve sondaki "space" karakterlerini siler,  aradaki "space" karakterlerine dokunmaz
        String f = e.trim();
        System.out.println(f);

        String h = "Java";
        String i = "Java";

        //compareTo(i); kod iki String'i alfabedik (lexicographic) olarak karsilastirir
        //Buyuk harf e duyarlidir.
        //Buyuk harf kucuk harf'e duyarli olmasini istemezseniz h.compareToIgnoreCase(i); kullanabilirsiniz.
        //h.compareTo(i); kodda "h" nin alphabetik sirasindan "i" nin alfabetik sirasi cikarilir.
        int k = h.compareTo(i);
        System.out.println(k);

        //a.repeat(5) kodu "a" String ini 5 kere yazdirmaya yarar
        //repeat(0) ; empty String return eder.
        //Java Document'e ulasmak icin  Windows ==> ctrl'e basili tutarak    Mac ==> Command"e basili tutarak
        String n = a.repeat(3);
        System.out.println(n);




    }
}
