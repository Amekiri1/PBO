package Pertemuan10.Tugas;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Pengguna mhs = new Mahasiswa("Deri");
        Pengguna pustakawan = new Pustakawan("Pak Agus");

        mhs.aktivitasUtama();
        pustakawan.aktivitasUtama();

        PenggunaDigital akun = new PenggunaDigital("Deri27");
        akun.login();
        akun.logout();
    }
}
