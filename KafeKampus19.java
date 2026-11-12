import java.util.Scanner;
public class KafeKampus19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        System.out.println("=== PENCARIAN MENU KAFE ===");
        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String cariMenu = sc.nextLine();
        boolean ditemukan = false;
        int indeksMenuDitemukan = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                ditemukan = true;
                indeksMenuDitemukan = i;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Menu \"" + menu[indeksMenuDitemukan] + "\" tersedia dengan harga Rp " + harga[indeksMenuDitemukan]);
        } else {
            System.out.println("Mohon maaf, menu \"" + cariMenu + "\" tidak tersedia di kafe kami.");
        }
        System.out.println("\n----------------------------------------\n");
        System.out.println("=== APLIKASI PEMESANAN KAFE KAMPUS ===");
        System.out.println("Daftar Menu Tersedia:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.println("----------------------------------------");
        System.out.print("Masukkan jumlah jenis item yang ingin dipesan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 

        String[] pesananNama = new String[jumlahPesanan];
        int[] pesananJumlah = new int[jumlahPesanan];
        int[] pesananSubtotal = new int[jumlahPesanan];
        int totalBiayaKeseluruhan = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            boolean menuValid = false;
            while (!menuValid) {
                System.out.print("Masukkan nama menu yang dipesan: ");
                String namaPesananInput = sc.nextLine();

                int idxDitemukan = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPesananInput)) {
                        idxDitemukan = j;
                        break;
                    }
                }
                if (idxDitemukan != -1) {
                    System.out.print("Masukkan jumlah porsi/gelas untuk " + menu[idxDitemukan] + ": ");
                    int jmlBeli = sc.nextInt();
                    sc.nextLine(); 

                    pesananNama[i] = menu[idxDitemukan];
                    pesananJumlah[i] = jmlBeli;
                    pesananSubtotal[i] = harga[idxDitemukan] * jmlBeli;
                    totalBiayaKeseluruhan += pesananSubtotal[i];
                    menuValid = true;
                } else {
                    System.out.println("Menu tidak valid atau tidak tersedia! Silakan masukkan nama menu dengan benar.");
                }
            }
        }
        System.out.println("\n========================================");
        System.out.println("          STRUK PEMESANAN KAFE          ");
        System.out.println("========================================");
        System.out.printf("%-20s %-8s %s\n", "Menu", "Jumlah", "Subtotal");
        System.out.println("----------------------------------------");

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%-20s %-8d Rp %d\n", pesananNama[i], pesananJumlah[i], pesananSubtotal[i]);
        }

        System.out.println("----------------------------------------");
        System.out.println("TOTAL KESELURUHAN       : Rp " + totalBiayaKeseluruhan);
        System.out.println("========================================");
        System.out.println("Terima kasih telah memesan di Kafe Kampus!");
        sc.close();
    }
} 
