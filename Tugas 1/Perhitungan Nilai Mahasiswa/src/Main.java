import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        int nim = input.nextInt();
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Masukkan Nilai QUIZ: ");
        double nilaiQuiz  = input.nextDouble();
        System.out.print("Masukkan Nilai TUBES: ");
        double nilaiTubes = input.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        Proseshitungnilai Nilai = new Proseshitungnilai();
        double nilaitotal = Nilai.TotalNilai(nilaiTubes, nilaiQuiz, nilaiTugas, nilaiUTS, nilaiUAS);
        
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai Matakuliah Pemograman Berorientasi Objek (PBO):" + nilaitotal);

        input.close();
    }   
}