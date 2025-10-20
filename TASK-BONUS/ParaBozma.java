public class ParaBozma {
    public static void main(String[] args) {

            int miktar = 278;
            int yuzluk = miktar / 100;
            int kalan = miktar % 100;
            int ellilik = kalan / 50;
            kalan %= 50;
            int yirmilik = kalan / 20;
            kalan %= 20;
            int beslik = kalan / 5;
            kalan %= 5;
            int ikilik = kalan / 2;
            kalan %= 2;
            System.out.println(yuzluk + "x100,"
                    + ellilik + "x50,"
                    + yirmilik + "x20,"
                    + beslik + "x5,"
                    + ikilik + "x2,"
                    + kalan + "x1,");
    }
}
