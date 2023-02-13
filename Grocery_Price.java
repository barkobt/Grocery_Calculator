import java.util.Scanner;
/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */
public class Grocery_Price {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 8.95;
        double patlican = 5.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç KG armut aldınız?:");
        int kgarmut = input.nextInt();
        System.out.println("Kaç KG elma aldınız?:");
        int kgelma = input.nextInt();
        System.out.println("Kaç KG domates aldınız?:");
        int kgdomates = input.nextInt();
        System.out.println("Kaç KG muz aldınız?:");
        int kgmuz = input.nextInt();
        System.out.println("Kaç KG patlıcan aldınız?:");
        int kgpatlican = input.nextInt();

        double total = ((kgarmut*armut)+(kgdomates*domates)+(kgelma*elma)+(kgmuz*muz)+(kgpatlican*patlican));
        System.out.println("Toplam:"+total+"TL");




    }


}
