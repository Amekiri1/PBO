package Pertemuan10.Tugas;

public abstract class Pengguna {
    String nama;

    public Pengguna(String nama) {
        this.nama = nama;
    }

    public abstract void aktivitasUtama();
}
