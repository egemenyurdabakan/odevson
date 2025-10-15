public class Main {
    public static void main(String[] args) {

        double sayi1 = 12;
        double sayi2 = 4;

        double toplam = sayi1 + sayi2;
        double fark = sayi1 - sayi2;
        double carpım = sayi1 * sayi2;
        double bolum = sayi1 / sayi2;

        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Çarpım: " + carpım);
        System.out.println("Bölüm:" + bolum);

        double kenar = 6;
        double cevre = 3 * kenar;
        double alan = (Math.pow(kenar,2) * Math.sqrt (3)) / 4;;

                System.out.println("Eşkenar üçgenin çevresi: " + cevre);
        System.out.println("Eşkenar üçgenin alanı: " + alan);
    }
}