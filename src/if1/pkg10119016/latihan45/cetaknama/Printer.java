 package if1.pkg10119016.latihan45.cetaknama;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program 
 * cetak nama menggunakan getter setter
 */
public class Printer {
 private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void cetak(String nama){
        System.out.println("Nama Anda\t\t: ".concat(nama));
    }

    public void cetak(int jmlCetak, String nama){
        for (int i = 1; i <= jmlCetak; i++) {
            System.out.println(i + ". "+nama);
        }
    }

}