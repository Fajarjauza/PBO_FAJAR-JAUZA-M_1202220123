import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    private static List<Karyawan> listKaryawan;
    private static Scanner scanner;
    public static void main(String[] args){
        listKaryawan = new ArrayList<>();
        scanner      = new Scanner(System.in);
        showMenu();
    }
    private static void showMenu() {
        scanner = new Scanner(System.in);
        System.out.println("\n-----------------------------------------");
        System.out.println("Selamat Datang di Informasi Data Karyawan");
        System.out.println("-----------------------------------------");
        System.out.println("\n==== Menu ====");
        System.out.println("1. Tambah Data Karyawan");
        System.out.println("2. Hapus Data Karyawan");
        System.out.println("3. Tampilkan semua Data Karyawan");
        System.out.println("0. Keluar Program Data Karyawan");
        System.out.print("Silahkan masukan menu yang dipilih: ");
        int pilihMenu = scanner.nextInt();
        scanner.nextLine();
        switch (pilihMenu) {
            case 1:
                menuTambah();
                break;
            case 2:
                menuHapus();
                break;
            case 3:
                menuTampilkanData();
                break;
            case 0:
                System.out.println("\n==== Terimakasih ====");
                System.exit(0);
                break;
            default:  
                System.out.println("\nPilihan menu tidak valid.");
                showMenu();
        } 
    }

    public static void menuTambah() {
        System.out.println("\n---> Tambah Data Karyawan <---");
        System.out.println("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.println("Masukkan Jenis Kelamin: ");
        String jenisKelamin = scanner.nextLine();
        System.out.println("Masukkan Tanggal Lahir: ");
        String tanggalLahir = scanner.nextLine();
        System.out.println("Masukkan Alamat: ");
        String alamatTinggal = scanner.nextLine();
        System.out.println("Masukkan Nomor Telepon: ");
        String nomorTelepon = scanner.nextLine();
        System.out.println("Masukkan Email: ");
        String Email = scanner.nextLine();
        System.out.println("Masukkan Gaji Pokok: ");
        int gajipokok = scanner.nextInt();
        System.out.println("Masukkan Gaji Lembur: ");
        int lembur = scanner.nextInt();
        Salary salary = new Salary(nama, jenisKelamin, tanggalLahir, alamatTinggal, nomorTelepon, Email, gajipokok, lembur);
        listKaryawan.add(salary);

        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        System.out.println(salary.toString());

        System.out.println("\nTekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }
    public static void menuHapus(){
        System.out.println("\n---> HAPUS DATA KARYAWAN <---");
        System.out.println("Masukkan nama : ");
        String nama = scanner.nextLine();
    
        Karyawan karyawanToRemove = null;
        for (Karyawan karyawan : listKaryawan) {
            if (karyawan.getNama().equals(nama)) {
                karyawanToRemove = karyawan;
                break;
            }
        }
    
        if (karyawanToRemove != null) {
            listKaryawan.remove(karyawanToRemove);
            System.out.println("\nKaryawan dengan nama " + nama + " telah dihapus.");
        } else {
            System.out.println("\nKaryawan dengan nama " + nama + " tidak ditemukan.");
        } 
        showMenu();
    }
    
    
    private static void menuTampilkanData() {
        System.out.println("\n---> SEMUA DATA KARYAWAN <---");
        for(Karyawan karyawan : listKaryawan) {
            System.out.println (karyawan); 
        System.out.println("\nTekan Enter untuk melanjutkan...");
        scanner.nextLine();
        }
        showMenu();
    }
}
