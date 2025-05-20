package Pertemuan10.Tugas;

public class Mahasiswa extends Pengguna {
    public Mahasiswa(String nama) {
        super(nama);
    }

    @Override
    public void aktivitasUtama() {
        System.out.println("Mahasiswa " + nama + " sedang meminjam buku di perpustakaan.");
    }
}
