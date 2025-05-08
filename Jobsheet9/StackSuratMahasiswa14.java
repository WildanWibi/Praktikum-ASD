package Jobsheet9;

public class StackSuratMahasiswa14 {
    Surat14[] stack;
    int top, size;

    public StackSuratMahasiswa14(int size) {
        this.size = size;
        stack = new Surat14[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat14 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan Surat lagi!");
        }
    }

    public Surat14 pop() {
        if (!isEmpty()) {
            Surat14 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada Surat untuk Proses/Verifikasi.");
            return null;
        }
    }

    public Surat14 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada Surat untuk dikumpulkan.");
            return null;
        }
    }

    public Surat14 cariSurat(String namaMahasiswa) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return stack[i];
            }
        }
        return null;
    }
}
