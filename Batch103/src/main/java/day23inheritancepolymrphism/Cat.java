package day23inheritancepolymrphism;

public class Cat extends Mammal{
    public void meow(){
        System.out.println("Cats meow");

    }

    @Override// @Override annotation'ını kullanarak, Java'nın yaptığımız Override işlemini kontrol etmesini sağlarız.
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b*1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }
    //Asagidaki method "Overriding Method"
    @Override
    public Animal create() {
        return new Mammal();
    }


     /*
      1) Override yaparken "method un bady" si degistirilir.
      2) Override yaparken ASLA method signature(isim ve parametre) degistirilemez.
      3) Override yaparken "inheritance" olmak zorundedir.
      4) Override yaparken "Access modifier" lar belli kurallara gore farklilastirilabilirler.
        i) "private" method lar override edilemezler.
        ii) Child Class deki "override edilen" method un  access modifier i parent class daki method un
        access modifier i ile ayni veya daha genis olabilir.
        Note: Child class daki method un access modifier i daha dar olamaz.
        iii) defauld method lar ayni package icindeyse override edilebilirler.
             farklı package'dewn override edilemezler
      5)Parent class deki method un "return type" i void ise "return type " degistirilemez
      6)Parent class deki method un "return type" i primitive ise "return type " degistirilemez
      7)Parent Class'daki methodun "return type" i Wrapper Class ise "return type" degistirilemez.
      8)Parent Class'daki methodun "return type" i Child Class ise "return type" child lardan biri olabilir
       Note: Child Class'daki return type Parent Class'dakinden genis olamaz.
           Note: Aralarinda "Parent Child" iliskisi olmayan Class'lar Overriding'de Return Type degisiminde
                 kullanilamazlar. Mesela "Short", "Integer"dan kucuktur, fakat ararlarinda "Parent Child" iliskisi
                 olmadigindan "Integer" yerine "Short" kullanamazsiniz.
           Note: Child daki method'un Return Type'indan Parent'taki method'un Return Type'ina gidiste
                 "IS-A" Relationship olmali.
           Note: Aralarinda "IS-A" Relationship olan Data Type'lara "Covariant" denir.
      9) Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
         HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.
      10)"final" method'lar Override edilemezler, cunku "Overriding" de method body degistirilir fakat
         "final" method body degistirilmesine musaade etmez.
      11.Polymorphism(Çoklu yapı) = Overloading(add methodu gibi çoklu forma sahip) + Overriding(aynı method
         faklı şekillerde kullanılabiliyor.)
     */
}
