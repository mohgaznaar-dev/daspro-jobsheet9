 import java.util.Scanner;

public class Tugas1NilaiMahasiswa19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa yang ingin diinput: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        int total = 0;
        System.out.println("\n--- Masukkan Nilai Mahasiswa ---");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }
        double rata2 = (double) total / nilaiMhs.length;
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        System.out.println("\n========================================");
        System.out.println("          REKAPITULASI NILAI KELAS      ");
        System.out.println("========================================");
        System.out.println("Total Nilai Keseluruhan : " + total);
        System.out.println("Rata-rata Kelas         : " + rata2);
        System.out.println("Nilai Tertinggi         : " + tertinggi);
        System.out.println("Nilai Terendah          : " + terendah);
        System.out.println("----------------------------------------");
        System.out.println("Daftar Nilai & Status Kelulusan (KKM > 70):");
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            String status = (nilaiMhs[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilaiMhs[i] + " (" + status + ")");
        }
        System.out.println("========================================");

        sc.close();
    }
} 