package TugasJobsheet10;
import java.util.Scanner;

public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n====== MENU ANTRIAN KRS ======");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil untuk Proses KRS");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Cetak Jumlah Antrian");
            System.out.println("10. Cetak Jumlah Sudah KRS");
            System.out.println("11. Cetak Mahasiswa Belum KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    antrian.tambahAntrian(new Mahasiswa(nim, nama, prodi, kelas));
                    break;

                case 2:
                    antrian.panggilUntukKRS();
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    antrian.tampilkan2Terdepan();
                    break;

                case 5:
                    antrian.tampilkanAkhir();
                    break;

                case 6:
                    System.out.println(antrian.isEmpty() ? "Kosong" : "Tidak Kosong");
                    break;

                case 7:
                    System.out.println(antrian.isFull() ? "Penuh" : "Tidak Penuh");
                    break;

                case 8:
                    antrian.clear();
                    break;

                case 9:
                    antrian.cetakJumlahAntrian();
                    break;

                case 10:
                    antrian.cetakJumlahSelesaiKRS();
                    break;

                case 11:
                    antrian.cetakBelumKRS();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
