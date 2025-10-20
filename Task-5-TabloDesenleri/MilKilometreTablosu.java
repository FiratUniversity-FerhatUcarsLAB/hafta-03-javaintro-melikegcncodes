public class DonusumTablosu {
    public static void main(String[] args) {
    double mil1 = 1 * 1.609;
    double mil5 = 5 * 1.609;
    double mil10 = 10 * 1.609;
    double mil20 = 20 * 1.609;
    double mil50 = 50 * 1.609;

    System.out.println("Mil -> Kilomtre dönüşüm Tablosu");
    System.out.println("------------------------------");
    System.out.printf("%-10s %-10s%n", "Mil", "Kilomtre");

    System.out.printf("%-10d %-10.3f%n", 1 , mil1 );
    System.out.printf("%-10d %-10.3f%n", 5 , mil5 );
    System.out.printf("%-10d %-10.3f%n", 10 , mil10 );
    System.out.printf("%-10d %-10.3f%n", 20 , mil20 );
    System.out.printf("%-10d %-10.3f%n", 50 , mil50 );
    }
}
