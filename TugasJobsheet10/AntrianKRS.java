package TugasJobsheet10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int sudahKRS = 0;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil ditambahkan ke antrian.");
    }

    public void panggilUntukKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, Tidak bisa panggil untuk KRS.");
            return;
        }
        System.out.println("Mahasiswa yang dipanggil untuk KRS:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa mhs = data[front];
            front = (front + 1) % max;
            size--;
            sudahKRS++;
            mhs.tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkan2Terdepan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2.");
            return;
        }
        System.out.println("2 Mahasiswa Terdepan:");
        for (int i = 0; i < 2; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void tampilkanAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir:");
            data[rear].tampilkanData();
        }
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah antrian sekarang: " + size);
    }

    public void cetakJumlahSelesaiKRS() {
        System.out.println("Jumlah yang sudah melakukan KRS: " + sudahKRS);
    }

    public void cetakBelumKRS() {
        int belum = 30 - sudahKRS;
        System.out.println("Mahasiswa yang belum melakukan KRS: " + belum);
    }
}