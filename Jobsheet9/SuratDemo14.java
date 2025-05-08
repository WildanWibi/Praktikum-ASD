package Jobsheet9;
import java.util.Scanner;

public class SuratDemo14 {
    public static void main(String[] args) {
        StackSuratMahasiswa14 stack = new StackSuratMahasiswa14(10);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan nama mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("PILIH: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Id Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis izin (S/A): ");
                    char jenisIzin = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine(); 

                    Surat14 suratBaru = new Surat14(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(suratBaru);
                    System.out.println("Surat berhasil diterima.");
                    break;

                case 2:
                    Surat14 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat sedang diproses:");
                        diproses.tampilkanInformasi();
                    }
                    break;

                case 3:
                    Surat14 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat Izin Terakhir:");
                        terakhir.tampilkanInformasi();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = sc.nextLine();
                    Surat14 hasilCari = stack.cariSurat(cari);
                    if (hasilCari != null) {
                        System.out.println("Surat ditemukan:");
                        hasilCari.tampilkanInformasi();
                    } else {
                        System.out.println("Surat dari " + cari + " tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilih != 5);

        sc.close();
    }
}
