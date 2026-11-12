import java.util.Scanner;
public class SearchNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        int[] nilai = new int[n];
        System.out.println("masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i +": ");
            nilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin di cari (key): ");
        int key = sc.nextInt();
        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("nilai " + key + "yang Anda cari sama sekali tidak terdaftar di dalam sistem.");
        }
    }
    
}
