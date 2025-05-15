package Pertemuan12;

public class Mahasiswa14 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa14(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampilInformasi () {
        System.out.printf("%-12s %-10s %4s %4.1f\n", nama, nim, kelas, ipk);
    }
}
