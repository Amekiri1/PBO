package Pertemuan10.Tugas;

public class Pustakawan extends Pengguna {
    public Pustakawan(String nama) {
        super(nama);
    }

    @Override
    public void aktivitasUtama() {
        System.out.println("Pustakawan " + nama + " sedang mendata koleksi buku.");
    }
}
