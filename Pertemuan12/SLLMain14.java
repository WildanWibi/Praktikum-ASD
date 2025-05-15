package Pertemuan12;

public class SLLMain14 {
    public static void main(String[] args) {
        SingleLinkedList14 sll = new SingleLinkedList14();

        Mahasiswa14 mhs1 = new Mahasiswa14("Alvaro", "24212200", "1A", 4.0);
        Mahasiswa14 mhs2 = new Mahasiswa14("Bimon",  "23212201", "2B", 3.8);
        Mahasiswa14 mhs3 = new Mahasiswa14("Cintia", "22212202", "3C", 3.5);
        Mahasiswa14 mhs4 = new Mahasiswa14("Dirga",  "21212203", "4D", 3.6);
        
        
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

    }
}
