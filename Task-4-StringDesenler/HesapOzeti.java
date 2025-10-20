public class HesapOzeti {
    public static void main(String[] args) {
        String[] Urunler = {"Ekmek","Süt","Peynir","Domates","Makarna","Zeytinyağı"};
        double[] miktar = {2, 1, 0.5, 1, 3, 1};
        double[] birimFiyat = {10, 25, 120, 35, 15, 180};
        System.out.println("Urun        Miktar        Birim Fiyat(₺)         Toplam(₺)");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Ekmek       2             10                     20");
        System.out.println("Süt         1             25                     25");
        System.out.println("Peynir      0.5           120                    60");
        System.out.println("Domates     1             35                     35");
        System.out.println("Makarna     3             15                     45");
        System.out.println("Zeytinyağı  1             180                   180");
    }
}
