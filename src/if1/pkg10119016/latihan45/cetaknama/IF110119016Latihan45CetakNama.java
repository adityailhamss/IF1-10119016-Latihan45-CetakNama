package if1.pkg10119016.latihan45.cetaknama;
import java.util.Scanner;
/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program 
 * cetak nama menggunakan getter setter
 */
public class IF110119016Latihan45CetakNama {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        Printer printer1 = new Printer();
        System.out.println("=====Aplikasi Pencetakan Nama======");
        System.out.print("Masukkan nama anda\t: ");
        printer.setNama(scanner.nextLine());
        System.out.print("Mau cetak berapa kali ?\t: ");
        printer.setJmlCetak(scanner.nextInt());
        printer.cetak(printer.getNama());
        printer1.cetak(printer.getJmlCetak(), printer.getNama());
    }
}

