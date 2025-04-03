package T2_233040022.Tugas;

public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        System.out.println("Sebelum perubahan");
        System.out.println("L1 jari-jari: " + l1.getJari2());
        System.out.println("L2 jari-jari: " + l2.getJari2());
        ubahJari2(l2);
        System.out.println("Setelah perubahan");
        System.out.println("L1 jari-jari: " + l1.getJari2());
        System.out.println("L2 jari-jari: " + l2.getJari2());
        // Contoh objek = null
        l2 = null;
        System.out.println("Setelah 12 di null kan");
        System.out.println("L1 jari-jari: " + l1.getJari2()); // bisa diakses
        if (l2 != null) {
            System.out.println("L2 jari-jari: " + l2.getJari2());
        }  else {
            System.out.println("L2 tidak mereferensi objek");
        }
    }

    public static void ubahJari2(Lingkaran obj) {
        obj.setJari2(10);
    }
}
